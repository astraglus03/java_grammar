package c1Basic;

import java.util.*;
import java.io.*;

public class c10Set {
    public static void main(String[] args) {
//        중복X, 순서보장X
        Set<String> mySet = new HashSet<>();
        mySet.add("h");
        mySet.add("e");
        mySet.add("l");
        mySet.add("l");
        mySet.add("o");
        System.out.println(mySet);

        //    LinkedHashSet: 순서보장, 중복X
        Set<Integer> myLinkedSet = new LinkedHashSet<>();
        myLinkedSet.add(1);
        myLinkedSet.add(1);
        myLinkedSet.add(0);
        myLinkedSet.add(3);
        myLinkedSet.add(1);
        System.out.println(myLinkedSet);

//    Treeset: 데이터를 오름차순 정렬
        Set<Integer> myTreeSet = new TreeSet<>();
        myTreeSet.add(1);
        myTreeSet.add(1);
        myTreeSet.add(0);
        myTreeSet.add(3);
        myTreeSet.add(1);
        System.out.println(myTreeSet);

//        집합관련함수: 교집합(retainAll), 합집합(addAll), 차집합(removeAll)
        Set<String> set1 = new HashSet<>();
        set1.add("java");
        set1.add("python");
        set1.add("c++");
        Set<String> set2 = new HashSet<>();
        set2.add("java");
        set2.add("html");
        set2.add("css");

//        set1.retainAll(set2); // 교집합
//        System.out.println(set1); // java만 남음
//        set1.addAll(set2); // 합집합
//        System.out.println(set1); // java, python, c++, html, css가 남음
//        set1.removeAll(set2); // 차집합
//        System.out.println(set1); // java, python, c++가 남음

    }
}
