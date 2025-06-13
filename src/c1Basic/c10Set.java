package c1Basic;

import java.util.*;

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
    }
}
