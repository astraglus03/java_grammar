package c1Basic;

import java.util.*;

public class c08List {
    public static void main(String[] args) {
////        리스트 선언방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();
//
////        리스트 선언방법2
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 세팅방법1. 개별 data add
//
//        myList3.add("apple");
//        myList3.add("banana");
//        myList3.add("cherry");
//
//        System.out.println(myList3);
//
////        초기값 세팅방법2. 배열을 리스트로 변환
//
//        String[] fruits = {"apple", "banana", "cherry"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(fruits));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myIntList = new ArrayList<>();
//
//        for(int i: intArr){
//            myIntList.add(i);
//        }

////        add메서드: 리스트에 요소를 추가
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0,30); // list는 중간 데이터 삭제/삽입은 성능 비효율적
//        System.out.println(myList);
//
////        get(index): 특정 index의 요소 반환
//        System.out.println(myList.get(0));
////        1) index를 통한 삭제 2) value를 통한 삭제
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);
//
//        myList.clear();
//        System.out.println(myList.isEmpty());

//        indexOf: 특정값을 찾아 index return(가장 먼저 나오는 값)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(20);
//        System.out.println(myList2.indexOf(20)); // 1
//
////        contains: 특정값이 리스트에 있는지 여부 확인
//        System.out.println(myList2.contains(20)); // true
//        System.out.println(myList2.contains(40)); // false
//
//        정렬: 방법2가지(Collections 클래스, 객체사용)

//        List<Integer> myList = new ArrayList<>();
//        myList.add(20);
//        myList.add(10);
//        myList.add(4);
//        myList.add(50);
//
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);
//
////        객체(ArrayList클래스).sort()
//        myList.sort(Comparator.naturalOrder());
//        myList.sort(Comparator.reverseOrder());


//        이중리스트: 리스트안의 리스트
//        [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
//        List<List<Integer>> myList = new ArrayList<>();
//        List<Integer> myList1 = new ArrayList<>();
//        System.out.println(myList);
//        myList.add(myList1);
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        System.out.println(myList);
//        myList.get(0).add(2);
//        System.out.println(myList);
//        myList.get(1).add(3);
//        myList.get(1).add(4);




//        for문을 이용해서 [[1,2,3],[4,5,6],[7,8,9],[10,11,12]]
        List<List<Integer>> myList2 = new ArrayList<>();
        for(int i=0;i<4;i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=1;j<=3;j++){
                lst.add(i*3+j);
            }
            myList2.add(lst);
        }
        System.out.println(myList2);


//        리스트안에 배열
//        [{1,2},{1,2,3},{1,2,3,4}]
        List<int[]> arrayList = new ArrayList<>();

        arrayList.add(new int[2]);
        arrayList.get(0)[0] = 3;
        arrayList.get(0)[1] = 4;
        arrayList.add(new int[]{1,2});
        arrayList.add(new int[]{1,2,3});
        arrayList.add(new int[]{1,2,3,4});
        for(int[] arr : arrayList){
            System.out.println(Arrays.toString(arr));
        }

    }
}
