package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공
//        Comparable 인터페이스 : CompareTo 메서드 선언
//        Comparator 인터페이스 : compare 메서드 선언

//        String 클래스에 compareTo 매서드 내장.
//        String 클래스 및 java의 많은 클래스에서 Comparable을 상속하여 compareTo 매서드를 구현
        String a = "hello";
        String b = "World";

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("c++");
//        String안에 compareTo매서드를 사용하여 정렬이 이뤄짐.
//        Collections.sort(myList);
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("김C", 24));
        studentList.add(new Student("EC", 22));
        studentList.add(new Student("박C", 23));
        studentList.add(new Student("최C", 25));
        studentList.add(new Student("조C", 26));

//        정렬 방법1 : Student 객체에서 Comparable을 직접 구현한 방식
//        단점 : Student 객체를 직접 수정해야하므로, 유연성이 떨어짐.
//        Collections.sort(studentList);
//        Collections.sort(studentList);
//        정렬 방법2 : Comparator를 구현한 익명객체를 사용
//        Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator 객체를 요구하기 때문.
//        studentList.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);
//        studentList.sort(Comparator.comparing(Student::getName));


        String[] strArr = {"java", "python", "c++", "javascript", "c#"};
//        Arrays.sort(strArr);
//        Arrays.sort(strArr, Comparator.reverseOrder());
//        글자길이를 기준으로 내림차순 정렬
        Arrays.sort(strArr, (s1,s2) -> s2.length() - s1.length());

        System.out.println(Arrays.toString(strArr));


//        배열 안의 배열 정렬
        List<int[]> intList = new ArrayList<>();
        intList.add(new int[]{4, 5});
        intList.add(new int[]{1, 2});
        intList.add(new int[]{3, 0});
        intList.add(new int[]{2, 8});

//        정렬 : 리스트안의 배열에 index 1번째값을 기준으로 오름차순
        intList.sort((arr1,arr2) ->{
            if(arr1[1] == arr2[1]){
                return arr1[0] - arr2[0];
            }
            else{
                return arr1[1] - arr2[1];
            }
        });

//        intList.sort(Comparator.comparingInt((int[] arr) -> arr[1]).thenComparingInt(arr -> arr[0]));

        for(int[] arr : intList) {
            System.out.println(Arrays.toString(arr));
        }

    }
}

//class Student implements Comparable<Student> {
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", age=" + age +
                '}';
    }

//    //    정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분.
////    두수(또는 문자)의 비교의 경우 음수, 0, 양수 세 값중 하나만 return. 이를 통해 정렬 수행.
////    this가 앞에 있을땐 오름차순, this가 뒤에 있을땐 내림차순.
//    @Override
//    public int compareTo(Student o) {
////        return this.getName().compareTo(o.getName()); // this가 왼쪽이면 오름차순 오른쪽이면 내림차순
//        return o.getName().compareTo(this.getName()); // 내림차순 정렬
////        return this.getAge() - o.getAge(); // 오름차순 정렬
//    }
}
