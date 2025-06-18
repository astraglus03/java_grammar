package c02ClassBasic;

import java.util.Scanner;

public class c02MethodPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        if(c02MethodPractice.isPrime(input) && input>1){
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }



    }

    public static boolean isPrime(int num){
        for (int i = 2; i < Math.sqrt(num); i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
