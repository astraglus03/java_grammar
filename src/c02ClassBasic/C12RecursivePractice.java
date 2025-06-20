package c02ClassBasic;

import java.util.*;

public class C12RecursivePractice {
    public static void main(String[] args) {

        int number = 10;
//        재귀함수
        System.out.println(fibonacci(number));

//        DP: 메모이제이션 알고리즘
        int[] dp = new int[number];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<number;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(Arrays.toString(dp));
        System.out.println(dp[number - 1]);
     }

    public static int fibonacci(int n) {
        if(n<=2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}