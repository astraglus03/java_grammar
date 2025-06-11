package c1Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class c04IfStatement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        자바에서는 조건문을 걸고 한줄로 작성할 수 있음(줄바꿈 없어도 가능)
//        ex) if(조건) 실행문;
//        int a = 10;
//        if (a > 5) System.out.println("a는 5보다 큽니다.");

//        int ans = 1234;
//        if(ans == Integer.parseInt(br.readLine())){
//            System.out.println("정답입니다.");
//        } else {
//            System.out.println("틀렸습니다.");
//        }

//        int input = Integer.parseInt(br.readLine());

//        if(input >=10000){
//            System.out.println("택시를 타시오");
//        }
//        else if(input >=3000){
//            System.out.println("버스를 타시오");
//        }
//        else{
//            System.out.println("걸어가시오");
//        }
//        삼항연산자: 결과값 = 조건식 ? 반환값1 : 반환값2;
//        조건식이 참인경우 반환값1이 결과값에 담기고, 거짓인경우 반환값 2가 겨로가값에 담김.
//        String result = (ans == input) ? "문이 열립니다" : "문이 안열림";
//        System.out.println(result);

//        switch (input){
//            case 0:
//                System.out.println("예금업무입니다.");
//                break;
//            case 1:
//                System.out.println("대출업무입니다");
//                break;
//            case 2:
//                System.out.println("예금업무입니다.");
//                break;
//            case 3:
//                System.out.println("예금업무입니다.");
//                break;
//            default:
//                System.out.println("그외 잘못된 입력입니다");
//        }

//        for(int i=0; i<10; i++){
//            if(i%2==1){
//                System.out.println(i);
//            }
//        }
//        int a = 24;
//        int b = 36;
//        int gcd = 1;
//        for (int i = 1; i <= Math.min(a,b); i++) {
//            if (a % i == 0 && b % i == 0) {
//                gcd = i;
//            }
//        }
//        System.out.println(gcd);
//
//        int lcm = (a * b) / gcd;
//        System.out.println(lcm);
//
//        int input = Integer.parseInt(br.readLine());
//        boolean check = false;
//        for(int i=2;i<input;i++){
//            if(input%i==0){
//                check = true;
//                break;
//            }
//        }
//        if(check){
//            System.out.println("소수입니다.");
//        } else {
//            System.out.println("소수가 아닙니다.");
//        }

//        continue는 코드의 직관성과 가독성을 위해 사용

//        int[] arr = {1, 3, 5, 7};

//        for(int i=0; i<arr.length; i++){
//            arr[i]+=10;
//        }
//        System.out.println(Arrays.toString(arr));
//    }

//        for (int i : arr) {
//            System.out.println(i);
//        }

//        for(int i=1; i<10;i++){
//            for(int j=1;j<10;j++){
//                System.out.println(i + " * " + j + " = " + i*j);
//            }
//        }
//        라벨문: 반복문에 이름을 뭍이는것.
//        loop1:
//        for(int i=1; i<10;i++){
//            loop2:
//            for(int j=1;j<10;j++){
//                if(true){
//                    break loop1; // loop1 라벨이 붙은 반복문을 빠져나감
//                }
//            }
//        }

//        int[][] arr2 = {
//            {1, 2, 3},
//            {4, 5, 11},
//            {7, 8, 9},
//            {10, 11, 12}
//        };
//
//        loop1:
//        for(int i=0; i<arr2.length; i++){
//            for(int j=0; j<arr2[i].length; j++){
//                if(arr2[i][j] == 11){
//                    System.out.println(i+" " + j);
//                    break loop1;
//                }
//            }
//        }
        loop:
        for (int i = 100; i < 201; i++) {
            for (int j = 2; j < Math.sqrt(i)+1; j++) {
                if (i % j == 0) {
                    continue loop;
                }
            }
            System.out.println(i);
            break;
        }


    }
}
