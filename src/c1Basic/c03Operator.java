package c1Basic;

public class c03Operator {
    public static void main(String[] args) {
        // 산술연산자
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + (a + b)); // 덧셈
        System.out.println("a - b = " + (a - b)); // 뺄셈
        System.out.println("a * b = " + (a * b)); // 곱셈
        System.out.println("b / a = " + (b / a)); // 나눗셈
        System.out.println("b % a = " + (b % a)); // 나머지

        // 비교연산자
        System.out.println("a == b: " + (a == b)); // 같음
        System.out.println("a != b: " + (a != b)); // 다름
        System.out.println("a > b: " + (a > b));   // 크다
        System.out.println("a < b: " + (a < b));   // 작다
        System.out.println("a >= b: " + (a >= b)); // 크거나 같다
        System.out.println("a <= b: " + (a <= b)); // 작거나 같다

        // 논리연산자
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // AND 연산
        System.out.println("x || y: " + (x || y)); // OR 연산
        System.out.println("!x: " + (!x));         // NOT 연산

        // 비트연산자
        int m = 11;  // 0101
        int n = 3;  // 0011
//      두수를 &비트연산하게 되면 각 자릿수에 모두 1이 있어야 1의 결과값이 나옴
        System.out.println("m & n: " + (m & n)); // AND 연산 (0101 & 0011 = 0001)

//      왼쪽으로 1칸 옮긴다는 의미는 해당 숫자값에 X2 한다는 의미
//      오른쪽으로 1칸 옮기게 되면 해당 숫자값에 /2 하게되는것을 의미

        System.out.println(m>>2); // 오른쪽 시프트 (11 >> 2 = 2)
        System.out.println(m<<2); // 왼쪽 시프트 연산 (0101 << 2 = 1100)
    }
}
