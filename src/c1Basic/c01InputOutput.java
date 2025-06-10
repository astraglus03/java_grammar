package c1Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 출력할때 홑따옴표는 안되고 쌍따옴표를 사용해야함.
public class c01InputOutput {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello and welcome!");

        // System in: 키보드 입력
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine(); // 입력받은 데이터를 한줄로 읽어서, String으로 전환
//        System.out.println("입력한 값: " + input);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        System.out.println(input);


        StringTokenizer st = new StringTokenizer(input);
        // StringTokenizer는 공백을 기준으로 문자열을 분리 배열로 해도 됨.
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());



    }
}
