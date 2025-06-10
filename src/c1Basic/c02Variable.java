package c1Basic;

import java.math.BigDecimal;

public class c02Variable {
    public static void main(String[] args) {
//        byte a = 127;
//        byte b = -128;
//        // 오버플로우 : 자료형이 표현할 수 있는 범위를 넘어선 경우
//        a++;
//        // 언더플로우
//        b--;
//        System.out.println("a = " + a); // a = -128
//        System.out.println("b = " + b); // b = 127
//
//        int i1 = 10;
//        int l1 = 10;
//        // long은 명시적으로 L을 붙여 long타입임을 명시하기도 함
//        long l2 = 10L;
//
//        // 실수: float,double(기본) -> 실수연산은 오차를 발생시킴
//        float f1 = 1.123f;
//        double d1 = 1.123;
//
//        // 부동 소수점 오차 테스트
//        double d2 = 0.2;
//        System.out.println(d2);
//
//        double total = 0;
//        for(int j=0;j<1000;j++){
//            total += 0.1;
//        }
//        System.out.println("total = " + total);
//
//        // 소수점 오차 해결 방법: BigDecimal 사용
//        // 값을 입력받을때부터 소수점으로 받으면 문자로 입력받아야 함.
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//        BigDecimal bd1 = new BigDecimal("1.03");
//        BigDecimal bd2 = new BigDecimal("0.42");
//        double res = bd1.subtract(bd2).doubleValue();
//        System.out.println(bd1.subtract(bd2));
//
//        // 문자형: char
//        char cl ='가';
//        String st1 = "가나";
//
//        // boolean: true, false
//        boolean isTrue = true;
//        System.out.println(isTrue);
//
//        // null도 하나의 타입
//        String st1 = "";
//        String st2 = null; // null은 아무것도 없는 상태를 의미
//        System.out.println(st1);
//        System.out.println(st2);

//        타입변환
//        묵시적타입변환
//        char c1 = 'a';
//        int i1 = c1;
//        System.out.println(i1);
//        System.out.println('a' > 'b');

//        int -> double

        int t1 = 10;
        double d1 = t1; // 묵시적 타입변환
        System.out.println(d1);

//        double -> int
        double d2 = 10.5;
        int t2 = (int) d2; // 명시적 타입변환
        System.out.println(t2); // 10

//        변수와 상수
        int a1=10;
//        변수값 재할당은 가능
        a1=20;
//        변수값 재선언하는것은 불가능
//        int a1=30;

//        상수는 초기값을 할당한 이후에는 재할당하는것이 불가능
//        상수는 final 키워드를 사용
        final int tmp1 = 20;


    }
}
