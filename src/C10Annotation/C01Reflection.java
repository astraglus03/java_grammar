package C10Annotation;

import java.lang.reflect.Field;

public class C01Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
//        reflection은 자바에서 런타임시점에 클래스의 변수를 수정할 수 있는 기능.
        Person p1 = new Person();
//        아래와 같은 방식을 통해 private변수인 name변수에 직접 접근.
        Field nameField = Person.class.getDeclaredField("name");
        nameField.setAccessible(true); // private 변수에 접근 가능하도록 설정
        nameField.set(p1, "bradKim");
        System.out.println(p1);

    }
}


class Person{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}