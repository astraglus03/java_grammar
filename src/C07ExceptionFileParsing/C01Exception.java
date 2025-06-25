package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.IOException;
import java.sql.SQLException;

public class C01Exception {
    public static void main(String[] args) throws IOException {
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

        System.out.println("로그인 프로그램입니다.");
        String input = br.readLine();

//        checked exception의 경우에는 예외처리를 위임받게되면, 반드시 예외처리를 하거나, 다시 throws해야함.
//        스프링에서는 롤백을 해야하기 때문에 checked를 unchecked로 변환하는 경우가 많음.
        try{
            login2(input);
        }catch(SQLException e) {
            e.printStackTrace();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
//    throws 키워드를 통해 예외를 위임.
//    다만, unchecked 예외에서는 예외처리가 강제가 아니므로, throws가 큰의미는 없음.
//    그러나, checked 예외에서는 예외처리가 강제되므로, throws가 의미가 있음.

    static boolean login(String pw) {
        if (pw.equals("1234")) {
            return true;
        } else {
//            예외를 강제 발생시킴으로서 이 시점에서 해당 메서드 강제 종료
//            예외는 기본적으로 해당 메서드를 호출한 쪽으로 전파
            throw new IllegalArgumentException("비밀번호가 틀렸습니다.");
        }
    }

    static boolean login2(String pw) throws SQLException {
        if (pw.equals("1234")) {
            return true;
        } else {
//            checked exception은 예외처리가 강제.
//            해당 메서드내에서 예외처리를 하든, 아니면 명시적으로 throws를 통해 호출 메서드쪽에 위임.
            throw new SQLException("비밀번호가 틀렸습니다.");
        }
    }
}
