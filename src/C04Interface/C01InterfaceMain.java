package C04Interface;
import java.util.*;

import java.util.LinkedList;

public class C01InterfaceMain {
    public static void main(String[] args) {
        C01Cat c1 = new C01Cat();
        c1.makeSound();
        C01Dog d1 = new C01Dog();
        d1.makeSound();

//        다형성 : 하나의 부모타입으로 여러 자식객체를 다룰수 있음.
        C01AnimalInterface1 c2 = new C01Cat();
        c2.makeSound();
        C01AnimalInterface1 d2 = new C01Dog();
        d2.makeSound();

//        예시
//        인터페이스의 장점: 개발의 표준을 지정
//        다형성의 장점 : 기존의 구현체를 다른 구현체로 변경시 이점.
        List<Integer> myList1 = new LinkedList<>();
        myList1.add(10);
        myList1.add(20);
        myList1.add(30);
        myList1.get(0);


//        다중구현의 예시 -> 인터페이스에 따라 사용가능 메서드가 제한.
        List<Integer> list = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

//        다중구햔(상속)
        C01AnimalInterface2 c3 = new C01Cat();
        C01AnimalInterface2 d3 = new C01Dog();

        System.out.println(c3.play("고양이", "고냠미"));
        System.out.println(d3.play("강아지", "멍멍이"));


//        List<Integer> myList2 = new LinkedList<>();
//        myList2.add(20);

    }
}
