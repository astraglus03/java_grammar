package C06EtcClass;

enum ClassGrade {
    First_Grade, Second_Grade, Third_Grade,
}

public class C03EnumMain {
    public static void main(String[] args) {
//        classGrade를 일반문자열로 세팅할 경우 -> 정해진 문자열이 아닌, 개별적으로 생성된 문자열 삽입
//        Student s1 = new Student("홍길동1", "1학년");
//        Student s2 = new Student("홍길동2", "firstGrade");
//        Student s3 = new Student("홍길동3", "first_grade");

//        static final을 통해 변수값 관리하는 방법 -> 타입이 String이므로 얼마든지 자유롭게 세팅이 가능한 문제점 존재.
        Student s1 = new Student("홍길동1", ClassGrade.First_Grade);
        Student s2 = new Student("홍길동2", ClassGrade.Second_Grade);
        Student s3 = new Student("홍길동3", ClassGrade.Third_Grade);

        System.out.println(s1.getClassGrade());


    }
}

//class ClassGrade{
//    public static final String c1 = "first_grade";
//    public static final String c2 = "second_grade";
//    public static final String c3 = "third_grade";
//}

class Student{
    private String name;
    private ClassGrade classGrade;

    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

    public String getName() {
        return name;
    }

    public ClassGrade getClassGrade() {
        return classGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classGrade=" + classGrade +
                '}';
    }
}