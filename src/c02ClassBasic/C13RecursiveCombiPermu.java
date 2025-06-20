package c02ClassBasic;

import java.util.*;
import java.io.*;

//조합(combination)과 순열(permutation)
public class C13RecursiveCombiPermu {
    public static void main(String[] args) {
//        int total = 0;
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3;j++){
//                System.out.println("Hello World!" + total);
//                total++;
//            }
//        }

//        forRecur(0,2);

//        재귀함수 예제 : 조합
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
//        숫자 1,2,3,4를 가지고 만들 수 있는 2개짜리 숫자조합을 이중리스트에 담아 출력
        List<List<Integer>> result = new ArrayList<>();
//        for(int i=0; i<myList.size();i++){
//            for(int j=i+1;j<myList.size();j++){
//                List<Integer> tmp = new ArrayList<>();
//                tmp.add(myList.get(i));
//                tmp.add(myList.get(j));
//                result.add(tmp);
//            }
//        }
//        System.out.println(result);

//        System.out.println("=====================");
//        recurCombination(myList, new ArrayList<>(), 0, 2, result);
        boolean[] visited = new boolean[myList.size()];
        recurPermutation(myList, new ArrayList<>(), 2, result, visited);
        System.out.println(result);
    }
    static int staticCount=0;

    static void forRecur(int num ,int target){
        if(num == target){
            return;
        }
        for(int i=0; i<3; i++){
            System.out.println("Hello World!" + num + " " + i);
            forRecur(num+1, target);
        }
    }

//    재귀함수 예제 : 조합
    static void recurCombination(List<Integer> myList, List<Integer> tmpList, int start, int target, List<List<Integer>> result){
        if(tmpList.size() == target){
            result.add(new ArrayList<>(tmpList));
            return;
        }
        for(int i=start; i<myList.size(); i++){
            tmpList.add(myList.get(i));
            recurCombination(myList, tmpList, i+1, target, result);
            tmpList.remove(tmpList.size()-1);
        }
    }

    static void recurPermutation(List<Integer> myList, List<Integer> tmpList, int target, List<List<Integer>> result, boolean[] visited){
        if(tmpList.size() == target){
            result.add(new ArrayList<>(tmpList));
            return;
        }

        for(int i=0; i<myList.size(); i++){
            if(visited[i]) continue;
            visited[i] = true;
            tmpList.add(myList.get(i));
            recurPermutation(myList, tmpList, target, result, visited);
            tmpList.remove(tmpList.size()-1);
            visited[i] = false;
        }
    }
}
