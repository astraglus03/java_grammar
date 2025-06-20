package c02ClassBasic;

import java.util.*;
import java.io.*;

public class C11RecusiveBasic {
    public static void main(String[] args) {
        int number = 10;
        System.out.println(factorial(number));


        int target = 3;
//        recur0(0,target);

        List<Integer> lst = new ArrayList<>();

        recur2(lst, 0, target);
    }


    public static void recur0(int count, int target){
        if(count == target){
            return;
        }
        System.out.println("재귀 호출전 count: " + count);
        count = count+1;
        recur0(count, target);
        System.out.println("재귀 호출후 count: " + count);
    }

//    객체를 매개변수로 활용한 재귀함수 : 객체는 힙메모리를 통해 원본객체가 변경될 수 있으므로, 재귀함수간에 값이 일치되는 현상.
    public static void recur2(List<Integer> myList, int num, int target){
        if(myList.size() == target){
            return;
        }
        myList.add(num);
        recur2(myList, num+1, target);
        System.out.println(myList);
    }

    public static int factorial(int n) {
        if (n<=1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
