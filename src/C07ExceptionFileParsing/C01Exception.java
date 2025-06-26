package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.InvalidParameterException;
import java.sql.SQLException;
import java.util.NoSuchElementException;

public class C01Exception {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
//        일반적인 예외처리 방식
//        System.out.println("나눗셈 프로그램입니다.");
//        System.out.println("분자를 입력해주세요.");
//        int head = Integer.parseInt(br.readLine());
//        System.out.println("분모를 입력해주세요.");
//        int tail = Integer.parseInt(br.readLine());
//
//        double result = (double) head / tail;
//        System.out.println("결과는 " + result + "입니다.");

//        try {
//            System.out.println("나눗셈 프로그램입니다.");
//            System.out.println("분자를 입력해주세요.");
//            int head = Integer.parseInt(br.readLine());
//            System.out.println("분모를 입력해주세요.");
//            int tail = Integer.parseInt(br.readLine());
//
//            int result =  head / tail; // 여기서 예외 발생시 try내부의 하단 코드는 실행되지 않음.
//            System.out.println("결과는 " + result + "입니다.");
////            catch를 통해 예상되는 예외클래스를 분기처리한다.
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없습니다.");
////            아래와 같은 방식으로 시스템 로그를 기록
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//        catch(NumberFormatException e) {
//            System.out.println("문자를 입력하시면 안됩니다.");
//            e.printStackTrace();
////            Exception은 모든 예외의 조상 클래스
//        } catch(Exception e){
//            System.out.println("예상치 못한 에러가 발생했습니다.");
//            e.printStackTrace();
////            예외가 발생하든 하지 않든 무조건 실행되는 구문
//        } finally{
//            System.out.println("프로그램을 종료합니다.");
//            br.close();
//        }

////        의도된 예외 강제 발생 : 특정 시점에 프로그램을 강제 중지.
//        System.out.println("로그인 프로그램입니다.");
//        String input = br.readLine();
//        if(login(input)){
//            System.out.println("로그인 성공!");
//        } else {
//            System.out.println("로그인 실패!");
//        }

//        checked exception의 경우에는 예외처리를 위임받게되면, 반드시 예외처리를 하거나, 다시 throws해야함.
//        스프링에서는 롤백을 해야하기 때문에 checked를 unchecked로 변환하는 경우가 많음.

//        chcked exception의 경우
//        1) 호출받는 쪽에서 예외처리 후 unchecked exception 예외 발생. 호출하는 쪽에서 예외처리하여 사용자에게 적절한 message 전달
        try{
            String result = fileRead("src/C07ExceptionFileParsing/text.txt");
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

//        2) throws를 통해 checked예외처리를 위임받게
//        String result = null;
//        try{
//            result = fileRead("src/C07ExceptionFileParsing/text.txt");
//        }catch(RuntimeException e){
//            throw new RuntimeException("파일 읽기 중 오류가 발생했습니다.", e);
//        }

//        System.out.println(result);
    }
//    throws 키워드를 통해 예외를 위임.
//    다만, unchecked 예외에서는 예외처리가 강제가 아니므로, throws가 큰의미는 없음.
//    그러나, checked 예외에서는 예외처리가 강제되므로, throws가 의미가 있음.

    static boolean login(String pw) throws IllegalArgumentException, NoSuchElementException {
//        예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
//        예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
        if (pw.equals("1234")) {
            return true;
        } else if(pw == null){
            throw new IllegalArgumentException("비밀번호가 입력되지 않았습니다.");
        } else{
            throw new NoSuchElementException("비밀번호가 틀렸습니다.");
        }
    }
//    static String fileRead(String path) throws IOException {
        static String fileRead(String path) throws RuntimeException {
        Path filePath = Paths.get(path);
//        checked Exception의 경우 예외처리가 강제
////        방법1. checked를 try catch한 이후에 unchecked예외를 다시 throw
////        방법1을 더 많이 사용함
        String text = null;

        try{
            text = Files.readString(filePath);
        }catch(IOException e){
//            System.out.println("입출력 과정에서 예외가 발생했습니다.");
//            보통은 코드중지 목적으로 unchecked exception 다시 throw.
            throw new RuntimeException("입출력 과정에서 예외가 발생했습니다.");
        }

////        방법2. 현재 메서드를 호출하는 쪽으로 예외를 위임(throws 키워드 사용)
//        String text = Files.readString(filePath);
        return text;
    }
}