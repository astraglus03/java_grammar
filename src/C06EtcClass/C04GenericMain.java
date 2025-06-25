package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// <> : 제네릭(Generic) - 타입을 매개변수로 받는 클래스
public class C04GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "c++"};
        stChange(stArr,0,1);
        System.out.println(Arrays.toString(stArr));


//        원시자료형은 불가능함.
        Integer[] intArr = {1, 2, 3, 4, 5};
        stChange(intArr, 0, 4);
        System.out.println(Arrays.toString(intArr));

        Person p1 = new Person("홍길동");
        GenericPerson<Integer> gp1 = new GenericPerson<>(1);
        GenericPerson<String> gp2 = new GenericPerson<>("홍길동");


    }

    public static <T> void stChange(T[] arr, int i, int j){
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


class GenericPerson<T>{
    private T value;

    public GenericPerson(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
class Person{
    private String value;

    public Person(String value) {
        this.value = value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}