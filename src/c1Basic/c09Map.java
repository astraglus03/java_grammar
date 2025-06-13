package c1Basic;

import java.util.*;

public class c09Map {
    public static void main(String[] args) {
//        key, value 쌍으로 데이터를 저장하는 자료구조
//        key값은 중복이 있으면, value값이 덮어쓰여짐
        Map<String,Integer> sports = new HashMap<>();
        sports.put("농구", 5);
        sports.put("축구", 11);
        sports.put("배구", 6);

//        map은 key를 통해 value를 get
//        map에서 key값을 통한 검색 복잡도는 O(1)로 매우 빠름
        System.out.println(sports.get("농구")); // 5
        System.out.println(sports.get("축구")); // 11
        System.out.println(sports.get("배구")); // 6
    }
}
