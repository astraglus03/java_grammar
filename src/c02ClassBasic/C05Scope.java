package c02ClassBasic;

import java.util.*;

// 변수의 유효범위
public class C05Scope {

    public static int v2 = 10;
    public static void main(String[] args) throws Exception {
//        지역변수의 유효범위
        int v1 = 10;
        scope(v1);
        System.out.println(v1);

        C04Person person = new C04Person();
        person.setName("kim");
        person.setEmail("kim@navaer.com");
        person.setAge(21);

        scope2(person);
        System.out.println(person.printPerson());

        List<C04Person> personList = new ArrayList<>();
        personList.add(person); // 메모리 주소를 add
        personList.get(0).setAge(40);
        System.out.println(person.printPerson());
        System.out.println(v2);
        ;

//        객체의 유효범위

//        클래스변수의 유효범위


    }
    public static void scope(int v1){ // call by value
        v1=20;
        v2=30;
        System.out.println(v1);
    }

    public static void scope2(C04Person person) throws Exception { // 힙메모리 주소 넘김 -> call by reference
        person.setAge(30);
        System.out.println(person.printPerson());
    }
}
