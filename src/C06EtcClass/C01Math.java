package C06EtcClass;

import java.util.*;

public class C01Math {
    public static void main(String[] args) {
//        Math.random() : 임의의 수 반환. - 0.0 ~ 1.0 사이의 실수

//        로또번호 7개 뽑기. 1 ~ 99까지의 임의 숫자
        for(int i = 0; i < 7; i++) {
            System.out.print((int) (Math.random() * 99) + 1 + "\n");
        }

//        Math.abs() : 절대값 반환
        System.out.println(Math.abs(-10));
//        Math.ceil() : 올림
        System.out.println(Math.ceil(3.2));
//        Math.floor() : 내림
        System.out.println(Math.floor(3.8));
//        Math.round() : 반올림
        System.out.println(Math.round(3.5));
//        Math.max() : 두 수 중 큰 값 반환
        System.out.println(Math.max(10, 20));
//        Math.min() : 두 수 중 작은 값 반환
        System.out.println(Math.min(10, 20));
//        Math.pow() : 거듭제곱
        System.out.println(Math.pow(2, 3)); // 2^3 = 8
//        Math.sqrt() : 제곱근
        System.out.println(Math.sqrt(16)); // 4.0
//        Math.log() : 자연로그
        System.out.println(Math.log(Math.E)); // 1.0 (자연로그의 밑은 e)
//        Math.PI : 원주율
        System.out.println(Math.PI); // 3.141592653589793
    }
}
