package C05AnonymousLambda;
import java.util.*;
import java.util.stream.*;

public class C04StreamApi {
    public static void main(String[] args) {
//        int[] arr = {20,10,4,12};
////        전통적인 방식의 데이터 접근방법 : 메모리 주소 접근
//        for(int i=0; i<arr.length ; i++){
//            System.out.println(arr[i]);
//        }
//
////        함수형 프로그램 방식 : 데이터와 객체 중심이 아닌, 입력에 따른 출력만 존재
////        StreamApi : java에서 함수형프로그래밍을 지원하는 라이브러리
//        Arrays.stream(arr).forEach(a -> System.out.println(a));
//
////        스트림의 생성: stream()
//        List<String> list = new ArrayList<>();
//        list.add("java");
//        list.add("python");
//        list.add("c++");
//        Stream<String> stream1 = list.stream();
//
//        String[] myArr = new String[3];
//        myArr[0] = "hello";
//        myArr[1] = "world";
//        myArr[2] = "java";
//        Stream<String> stream2 = Arrays.stream(myArr);
//
////        원시자료형을 위한 stream객체가 별도로 존재.
//        Integer, Long, Double 등은 객체형이므로 일반 Stream을 사용 -> Stream<Integer>, Stream<Long>, Stream<Double> 등
//        int[] intArr = {10,20,30,40,50};
//        IntStream stream3 = Arrays.stream(intArr);
//
////        stream의 중계연산(변환) : filter, map, sorted, distinct 등
//        int[] intArr = {10,10,30,40,50};
////        30보다 작은 값들의 총합
////        filter : 특정기준으로 대상을 filtering하여 새로운 스트림 반환하는 중계연산 메서드
////        sum : 스트림의 요소를 하나씩소모하여 총합을 구하는 메서드
//        System.out.println(Arrays.stream(intArr).filter(a -> a<=30).sum());
//
////        map : 기존의 스트림을 조작하여 새로운 스트림을 반환
//        int[] intArr2 = {1,2,3,4,5};
//        int total2 = Arrays.stream(intArr2).map(a -> a*10).sum();
//        int[] newArr = Arrays.stream(intArr2).map(a -> a*10).toArray();
//        System.out.println(Arrays.toString(newArr));
//
////        distinct : 중복제거
//        int[] intArr3 = {1,2,3,4,5,5,5,6,7,8,9};
//        int total3 = Arrays.stream(intArr3).distinct().sum();
//
//        int[] intArr4 = {10,40,10,30,50};
////        sorted에 new Comparator를 사용할 수 있지만 원시자료형은 불가.
//        int[] sortedArr = Arrays.stream(intArr4).sorted().toArray();
//        System.out.println(Arrays.toString(sortedArr));

////        mapToInt : intStream 형태로 변환해주는 map
//        String[] strArr = {"HTML", "CSS", "JAVASCRIPT", "PYTHON"};
////        모든 문자열 길이의 총합
//        int totalLength = Arrays.stream(strArr).mapToInt(a -> a.length()).sum();
////        위 코드와 동일한 결과
////        int totalLength = Arrays.stream(strArr).mapToInt(String::length).sum();
//        System.out.println(totalLength);
//        int[] arr = {2,1,7,4,10,6,3,8,5,9};
////        arr에서 홀수만 담은 배열 생성 후 출력
//        int[] oddArr = Arrays.stream(arr).filter(a -> a%2==1).toArray();
//        System.out.println(Arrays.toString(oddArr));
//
////        arr에서 홀수만 걸러서 해당 홀수의 제곱값을 담은 배열을 생성 후 출력
//        int[] oddMultiArr = Arrays.stream(arr).filter(a -> a%2==1).map(a -> a*a).toArray();
//        System.out.println(Arrays.toString(oddMultiArr));
//
////        arr에서 홀수만 거르고, 제곱값을 구하고, 해당 숫자값을 내림차순한 순서로 배열을 생성 후 출력
//        int[] oddMultiSortedArr = Arrays.stream(arr).filter(a -> a%2==1).map(a -> a*a).sorted().toArray();
//        System.out.println(Arrays.toString(oddMultiSortedArr));

////        스트림의 소모 : foreach(출력), sum(합계), reduce(누적연산), max(최대값), min(최소값) count(개수), findFirst(첫번째 값 리턴) 등
        int[] intArr = {10,20,30,40};
//        Arrays.stream(intArr).forEach(a -> System.out.println(a));
//        int total = Arrays.stream(intArr).sum();
////        optional 객체 : 값이 있을수도 있고, 없을수도 있음을 명시한 객체
//        int max = Arrays.stream(intArr).max().getAsInt();
//        int min = Arrays.stream(intArr).min().getAsInt();
//        long count = Arrays.stream(intArr).count();

////        reduce : 누적연산 -> reduce(초기값, 연산식)
//        int acc = Arrays.stream(intArr).reduce(0, (a, b) -> a + b);
//        System.out.println(acc);
//
//        int accMulti = Arrays.stream(intArr).reduce(1,(a,b) -> a * b);
//        System.out.println(accMulti);
//
//        String[] stArr = {"hello", "world", "java", "python"};
//        String accStr = Arrays.stream(stArr).reduce("", (a, b) -> a + " " + b);
//        System.out.println(accStr.trim());
//
////        findFirst : 첫번째요소 반환
//        String firstSt = Arrays.stream(stArr).filter(a -> a.length() >= 5).findFirst().get();
//        System.out.println(firstSt);

//        주의사항 : 제네릭의 타입소거
//        자바의 런타임 시점에 <String>과 같은 제네릭의 타입소거 발생.
//        제네릭의 타입소거로 인해, toArray를 통해 바로 새로운 String배열을 만드는 것은 불가.
        String[] stArr = {"hello", "world", "java", "python"};
        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >=5).toArray(a -> new String[a]);



    }
}
