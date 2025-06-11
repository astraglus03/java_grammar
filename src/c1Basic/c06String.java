package c1Basic;

public class c06String {
    public static void main(String[] args) {
//        원시자료형은 스택메모리에 저장되므로, 비교시 값자체를 비교
        String st1 = new String("Hello");
        String st2 = new String("Hello");

        System.out.println(st1 == st2);
        System.out.println(st1.equals(st2));

//        Wrapper 클래스는 객체로 생성되므로, 주소값을 비교하게 됨.
        int i1 = 10;
        Integer ig1 = 10;


    }
}
