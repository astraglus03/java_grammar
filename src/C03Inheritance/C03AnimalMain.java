package C03Inheritance;

public class C03AnimalMain extends Animal{
    public static void main(String[] args) {
        C03AnimalMain c1 = new C03AnimalMain();
        c1.sound();

//        상속관계일때는 부모클래스의 타입을 자식클래스의 객체의 타입으로 지정하는것이 가능.
//        부모클래스의 타입을 지정시, 부모클래스에서 정의된 메서드만 객체에서 사용 가능.
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound();
        a2.sound();
//        a2.sound2(); // 컴파일 에러 발생: 부모클래스 타입으로 선언된 객체는 자식클래스의 메서드를 호출할 수 없음

    }
}

class Animal{
    void sound(){
        System.out.println("동물이 소리를 냅니다.");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("개가 멍멍 소리를 냅니다.");
    }
    void sound2(){
        System.out.println("개가 멍멍 소리를 냅니다. (sound2)");
    }
}

class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("고양이가 야옹 소리를 냅니다.");
    }
    void sound2(){
        System.out.println("고양이가 야옹 소리를 냅니다. (sound2)");
    }
}