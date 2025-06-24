package C05AnonymousLambda;

// 익명내부클래스
public class C02AnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal을 상속한 클래스가 별도로 존재하지않고
//        익명클래스가 만들어짐과 동시에 익명객체가 생성되고 있음.

        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound() {}
        };

//        구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성 가능.
        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound1() {

            }

            @Override
            public void makeSound2() {

            }
        };

//        인터페이스의 익명객체에 구현메서드가 1개밖에 없을경우 람다표현식(화살표함수) 사용가능.
        Animal2 a3 = () -> {
            System.out.println("hello world1");
            System.out.println("hello world2");
        };
        a3.makeSound1();

//        실행문이 1줄 일때에는 {} 제거 가능
        Animal2 a4 = () -> System.out.println("hello world1");

//        매개변수가 3개인 경우에도 람다표현식 사용가능
        Animal3 a5 = (a,b, c) -> {return a + "," + b + "," + c;};
        Animal3 a6 = (a,b, c) ->  a + "," + b + "," + c;

        System.out.println(a5.makeSound3("a", "b", "c"));
        System.out.println(a6.makeSound3("x", "y", "z"));


//        실습: Animal4 인터페이스를 정의. makeSound메서드 선언(매개변수는 String, String, int, 리턴타입은 String)
//        익명객체 생성 : 매서드의 기능 - int숫자값이 10이상이면 a+b를 리턴, int숫자값이 10미만이면 a만 리턴
//        Animal4 a7 = new Animal4() {
//            @Override
//            public String makeSound(String a, String b, int c) {
//                if(c>=10){
//                    return a + " " + b;
//                }
//                return a;
//            }
//        };
        Animal4 a7 = (a, b, c) -> {
            if(c >= 10){
                return a + " " + b;
            }
            return a;
        };

        System.out.println(a7.makeSound("hello", "world", 5));
        System.out.println(a7.makeSound("hello", "python", 10));

    }
}


abstract class AbstractAnimal{
    abstract void makeSound();
    void makeSound2(){

    }
}

interface Animal1{
    void makeSound1();

    void makeSound2();
}

interface Animal2{
    void makeSound1();
}

interface Animal3{
    String makeSound3(String a, String b, String c);
}

interface Animal4{
    String makeSound(String a, String b, int c);
}