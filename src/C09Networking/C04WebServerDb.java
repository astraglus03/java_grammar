package C09Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C04WebServerDb {
    public static void main(String[] args) throws SQLException, IOException {
//        ?id=1형태로 id를 받아서, DB를 조회하는 웹서버
        //        소켓이란 서버와 사용자가 통신을 하기 위한 네트워크 통신의 끝점을 나타내는 개념
        ServerSocket serverSocket = new ServerSocket(8090);
        System.out.println("서버 시작");
        while (true) {
//            accept : 사용자의 연결 요청을 수락
//            socket객체 안에는 사용자의 정보(ip 등)
            Socket socket = serverSocket.accept();
//            br의 사용자의 http request 문서가 담겨있음.
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null && !line.isEmpty()) {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            String requestString = sb.toString();
            String firstLine = requestString.split("\n")[0];
            String infos = firstLine.split(" ")[1];
            String id = "";
            if (infos.contains("?")) {
                id = infos.split("=")[1];
            }

////            id가 없거나 숫자가 아닌경우 처리
//            if (id.isEmpty() || !id.matches("\\d+")) {
//                String errorResponse = "HTTP/1.1 400 Bad Request\r\n" +
//                        "Content-Type: text/plain; charset=UTF-8\r\n" +
//                        "\r\n" + "Invalid ID parameter";
//                socket.getOutputStream().write(errorResponse.getBytes(StandardCharsets.UTF_8));
//                socket.getOutputStream().flush();
//                socket.close();
//                continue;
//            }

            //        사용자에게 문자열 형태로 응답

            String url = "jdbc:mysql://localhost:3306/board?useSSL=false";
            String userName = "root";
            String password = "1234";
            Connection connection = DriverManager.getConnection(url, userName, password);
//        Statement객체에 쿼리를 담아 db에 전달
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from post where id="+"\'"+id+"\'");
//        rs.next()를 통해 데이터를 1row씩 read

            StringBuilder responseBuilder = new StringBuilder();
            while (rs.next()) {
                responseBuilder.append("ID: ").append(rs.getInt("id")).append("\n");
                responseBuilder.append("Title: ").append(rs.getString("title")).append("\n");
                responseBuilder.append("Contents: ").append(rs.getString("contents")).append("\n");
            }
            connection.close();


//            사용자에게 응답을 줄 메시지를 http프로토콜에 맞게 세팅
            String reponse = "HTTP/1.1 200 OK\r\n" +
                    "Content-Type: text/plain; charset=UTF-8\r\n" +
                    "\r\n" + responseBuilder;
//            사용자에게 메시지 응답
            socket.getOutputStream().write(reponse.getBytes(StandardCharsets.UTF_8));
//            플러시란 일반적으로 변경사항을 확정하는 것을 의미
            socket.getOutputStream().flush();
            socket.close();

        }
    }
}
