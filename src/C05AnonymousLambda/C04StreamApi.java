package C05AnonymousLambda;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class C04StreamApi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
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
//        int[] intArr = {10,20,30,40};
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

////        주의사항 : 제네릭의 타입소거
////        자바의 런타임 시점에 <String>과 같은 제네릭의 타입소거 발생.
////        제네릭의 타입소거로 인해, toArray를 통해 바로 새로운 String배열을 만드는 것은 불가.
//        String[] stArr = {"hello", "world", "java", "python"};
//        String[] answer = Arrays.stream(stArr).filter(a -> a.length() >=5).toArray(a -> new String[a]);
//
//
////        메서드 참조 : 하나의 메서드만을 호출하는 경우, 매개변수를 제거한 형식. 클래스명 : 메서드명
//     Arrays.stream(stArr).forEach(System.out :: println);
//     String[] ans = Arrays.stream(stArr).filter(a -> a.length() >=5).toArray(String[] :: new);

////        StreamApi실습
////        List에 Student 객체 4개 담기 : {"Kim", 20}, {"Hong", 25}, {"Lee", 22}, {"Choi", 30}
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Kim", 20));
//        studentList.add(new Student("Hong", 32));
//        studentList.add(new Student("Lee", 22));
//        studentList.add(new Student("Choi", 30));
//
////        1) 모든 객체의 평균 나이
//        double averageAge = studentList.stream().mapToInt(Student::getAge).average().getAsDouble();
//        System.out.println("평균 나이: " + averageAge);
//
//
////        2)정렬을 통한 가장 나이 어린 사람 찾기
////        Student theYoungest = studentList.stream().sorted(Comparator.comparing(Student::getAge)).findFirst().get();
////        Student theYoungest = studentList.stream().min(Comparator.comparing(Student::getAge)).get();
//        Student theYoungest = studentList.stream().sorted((o1,o2) -> o1.getAge()).findFirst().get();
//        System.out.println(theYoungest);
//
//
////        3)30대인 사람들의 이름만 모아서 새로운 String배열에 담기
////        String[] the30s = studentList.stream().filter(a -> a.getAge() <=30).map(Student :: getName).toArray(String[] :: new);
////        System.out.println(Arrays.toString(the30s));
//        List<String> the30sList = studentList.stream().filter(a -> a.getAge() >= 30).map(Student::getName).toList();
//        System.out.println(the30sList);
//
////        Optional 객체 : 특정객체에 값이 없을수도 모른다는것을 명시적으로 표현
//        Optional<String> opt1 = Optional.ofNullable(null);
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }
//        else{
//            System.out.println("값이 없습니다.");
//        }

//        Optional객체 생성 방법 3가지
        Optional<String> opt1 = Optional.empty(); // 빈 Optional 객체 생성
        Optional<String> opt2 = Optional.ofNullable(null); // null을 허용하는 Optional 객체 생성
        Optional<String> opt2_1 = Optional.ofNullable("hello"); // null을 허용하는 Optional 객체 생성, 값이 있을 경우
        Optional<String> opt2_2 = Optional.of("hello"); // null을 허용하지 않는 Optional 객체 생성, 값이 있을 경우

//        Optional객체 처리 방법 4가지
//        방법1 : isPresent() 메서드로 값이 있는지 확인 후 get() 메서드로 값 가져오기
        if(opt1.isPresent()){
            System.out.println(opt1.get());
        } else {
            System.out.println("값이 없습니다.");
        }

//        방법2 : orElse() : 값이 있으면 있는 값 return, 없으면 지정한 값 return
        System.out.println(opt2_1.orElse("값이 없습니다."));

//        방법3 : orElseGet() : 값이 있으면 있는 값 return, 없으면 지정한 람다(supplier) 함수 실행 후 값 return
        System.out.println(opt2.orElseGet(() -> "값이 없습니다."));

//        방법4 : (가장많이 사용) orElseThrow() : 값이 있으면 있는 값 return, 없으면 지정한 예외 발생
//        개발에서 사용자에게 적잘한 메시지 전달 목적과 의도된 코드중단을 목표로 강제로 예외 발생시키는 경우는 매우 ㅁ낳음
//        System.out.println(opt2.orElseThrow(() -> new RuntimeException("런타임에러")));
//        System.out.println(opt2.get());

//        optional 객체 예시1
        List<Student> studentList = new ArrayList<>();
//        studentList.add(new Student("Kim", 20));
//        studentList.add(new Student("Hong", 32));
//        studentList.add(new Student("Lee", 22));
//        studentList.add(new Student("Choi", 30));

//        OptionalDouble age = studentList.stream().mapToInt(Student :: getAge).average();

//        if(age.isPresent()){
//            System.out.println(age.getAsDouble());
//        }
//        else{
//            throw new NoSuchElementException("학생이 없습니다.");
//        }

////        평균구하기 방법2
//        System.out.println(studentList.stream().mapToInt(Student::getAge).average().orElseThrow(() -> new NoSuchElementException("학생이 없습니다.")));

//        optional 객체 예시2
        studentList.add(new Student("Kim", 20));
        studentList.add(new Student("Hong", 32));
        studentList.add(new Student("Lee", 22));
        studentList.add(new Student("Choi", 30));
        System.out.println("조회하고자 하는 student의 index번호를 입력해주세요");
        int indexNum = Integer.parseInt(br.readLine());
//        index범위가 list안에 있으면 Optional.ofNullable() 또는 of, ofEmpty활용
//        System.out.println(Optional.ofNullable(studentList.get(indexNum)).orElseThrow(() -> new IndexOutOfBoundsException("해당 index의 학생이 없습니다.")));

//        Optional<Student> optionalStudent;
//
//        if(studentList.size() <= indexNum){
//            optionalStudent = Optional.empty();
//        }
//        else{
//            optionalStudent = Optional.of(studentList.get(indexNum));
//        }
//
//        System.out.println(optionalStudent.orElseThrow(() -> new IndexOutOfBoundsException("해당 index의 학생이 없습니다.")));

        System.out.println(Optional.ofNullable(indexNum < studentList.size() ? studentList.get(indexNum) : null).orElseThrow(() -> new IndexOutOfBoundsException("해당 index의 학생이 없습니다.")));



    }
}


//class Student{
//    private String name;
//    private int age;
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public int getAge() {
//        return age;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
//}