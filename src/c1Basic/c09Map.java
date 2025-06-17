package c1Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class c09Map {
    public static void main(String[] args) throws IOException {
//        key, value 쌍으로 데이터를 저장하는 자료구조
//        key값은 중복이 있으면, value값이 덮어쓰여짐
//        Map<String,Integer> sports = new HashMap<>();
//        sports.put("농구", 5);
//        sports.put("축구", 11);
//        sports.put("배구", 6);

//        map은 key를 통해 value를 get
//        map에서 key값을 통한 검색 복잡도는 O(1)로 매우 빠름
//        System.out.println(sports.get("농구")); // 5
//        System.out.println(sports.get("축구")); // 11
//        System.out.println(sports.get("배구")); // 6


//        map의 전체데이터 출력
//        map의 key값 접근시에 인덱스 사용 불가능(순서가 없음)
//        keySet(): map의 key목록을 리턴하는 메서드
//        values(): map의 value목록을 리턴하는 메서드
//        int total = 0;
//        for(int v: sports.values()){
//            total += v;
//        }
//        int total2 = 0;
//        for(String k: sports.keySet()){
//            total2+= sports.get(k);
//    }

//        remove: 키를 통해 map요소 삭제
//        sports.remove("농구");

//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("basketball", "농구");
//        sports.put("baseball", "야구");
//        putIfAbsent: key값이 없는 경우에만 put
//        sports.putIfAbsent("soccer","운동");
//        sports.putIfAbsent("tennis", "테니스");

//        System.out.println(sports);

//        containsKey: 특정 key값이 있는지 여부 확인
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("pingpong"));

//        map출력방법2가지 : 1.for-each문, 2. iterator
//        1. for-each문
//        for(String a: sports.keySet()){
//            System.out.println(a);
//            System.out.println(sports.get(a));
//        }

//        Set<String> mySet = sports.keySet();
//        for(String a: mySet){
//            System.out.println(a);
//        }

//        2. iterator
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("basketball", "농구");
//        sports.put("baseball", "야구");
//        Iterator<String> iterators =  sports.keySet().iterator();
//        next(): 다음 요소를 반환하고, 다음 요소가 없으면 NoSuchElementException 발생
//        System.out.println(sports);
//        System.out.println(iterators.next());
//        System.out.println(iterators.next());

//        hasNext(): 다음 요소가 있는지 여부를 반환
//        while(iterators.hasNext()){
//            System.out.println(iterators.next());
//        }

//        map은 Key의 value수를 count하는 목적으로 많이 활용
//        String[] arr = {"농구", "축구", "야구", "농구", "축구"};

//        Map<String, Integer> countMap = new HashMap<>();

//        for(String sport: arr){
//            if(countMap.containsKey(sport)){
//                countMap.put(sport, countMap.get(sport) + 1);
//            } else {
//                countMap.put(sport, 1);
//            }
//        }

//        getOrDefault: key가 없으면 기본값을 리턴
//        for(String sport:arr){
//            countMap.put(sport, countMap.getOrDefault(sport, 0) + 1);
//        }
//
//        System.out.println(countMap);
//
//        String[] removeArr = {"농구", "농구", "농구", "야구", "축구"};
//
//        for(String sport: removeArr){
//            if(countMap.containsKey(sport)){
//                countMap.put(sport,countMap.get(sport)-1);
//                if(countMap.get(sport)<=0){
//                    countMap.remove(sport);
//                }
//            }
//        }
//        System.out.println(countMap);
//
//        Map<String ,Integer> myMap = new HashMap<>();
//        myMap.put("축구",11);
//        myMap.put("농구",5);
//        myMap.put("배구",6);
//
////        value가 가장 큰 key값 찾기
//        int max = Integer.MIN_VALUE;
//        String maxSport = "";
//
//        for(String sport: myMap.keySet()){
//            if(myMap.get(sport) > max){
//                max = myMap.get(sport);
//                maxSport = sport;
//            }
//        }
//
//        System.out.println(maxSport+ " " +max );
//
//
////        문자열 비교
//        String st1 = "hello";
//        String st2 = "dello";
//        String st3 = "hello";
//
//        System.out.println(st1.compareTo(st2));
//        System.out.println(st2.compareTo(st3));

//        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        Map<String, Integer> bestSeller = new HashMap<>();
//
//        for(int i=0;i<n;i++){
//            String input = br.readLine();
//            if(bestSeller.containsKey(input)){
//                bestSeller.put(input, bestSeller.get(input) + 1);
//            } else {
//                bestSeller.put(input, 1);
//            }
//        }
//        System.out.println(bestSeller);
//        int maxCount = Integer.MIN_VALUE;
//        String bestBook = "";
//
//        for(String book: bestSeller.keySet()){
//            if(bestSeller.get(book) > maxCount){
//                maxCount = bestSeller.get(book);
//                bestBook = book;
//            } else if(bestSeller.get(book) == maxCount && book.compareTo(bestBook) < 0){
//                bestBook = book;
//            }
//        }
//
//        System.out.println(bestBook);

////        LinkedHashMap: 데이터의 삽입순서를 보장(유지)
//        Map<String,Integer> lm = new LinkedHashMap<>();
//        lm.put("hello5",1);
//        lm.put("hello1",2);
//        lm.put("hello3",3);
//        lm.put("hello2",4);
//        lm.put("hello4",5);
//
//        for(String l:lm.keySet()) System.out.println(l);
//
//
////        TreeMap: key를 정렬(오름차순)하여 map을 저장
////        정렬을 하게되면 복잡도 O(log n)으로 증가
//        Map<String,Integer> tm = new TreeMap<>();
//        tm.put("hello5",1);
//        tm.put("hello1",2);
//        tm.put("hello3",3);
//        tm.put("hello2",4);
//        tm.put("hello4",5);
//
//        for(String t: tm.keySet()) System.out.println(t);

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Map<String, Integer> tm = new TreeMap<>();
//        int n = Integer.parseInt(br.readLine());
//        for(int i=0; i<n;i++){
//            String[] input = br.readLine().split("\\.");
//            tm.put(input[1], tm.getOrDefault(input[1], 0) + 1);
//        }
//        for(String key: tm.keySet()) System.out.println(key + " " + tm.get(key));

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        Map<String, Integer> treeMap = new TreeMap<>();
//
//        for (int i = 0; i < n; i++) {
//            String s = br.readLine().split("\\.")[1];
//            treeMap.put(s, treeMap.getOrDefault(s, 0)+1);
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for (String s : treeMap.keySet()) {
//            sb.append(s).append(" ").append(treeMap.get(s)).append("\n");
//        }
//
//        System.out.println(sb);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        int[] arr1 =  new int[n];
        for(int i=0; i<n; i++){
            arr1[i] = Integer.parseInt(input1[i]);
        }

        int m = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        int[] arr2 =  new int[m];

        for(int j=0; j<m; j++){
            arr2[j] = Integer.parseInt(input2[j]);
        }

        br.close();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        System.out.println(map);
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<m; j++){
            sb.append(map.getOrDefault(arr2[j], 0)).append(" ");
        }
        System.out.println(sb.toString().trim());

    }
}
