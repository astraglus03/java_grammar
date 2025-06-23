package C03Inheritance;
import java.util.*;

// final키워드가 붙은 class는 상속 불가 + override 불가
//public class AbstractMain extends AbstractMain.FinalParents {
public class AbstractMain{
    String a = "a";
    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
        dog.makeSound2();
        dog.makeSound1();
//        추상클래스는 구현체가 없는 메서드가 있으므로, 기본적으로 객체 생성 불가능
//        AbstractAnimal animal = new AbstractAnimal();


//        실질적인 객체는 dog클래스를 통해 만들어지므로, 여기서는 d2의 makeSound2를 사용가능
        AbstractAnimal dog1 = new AbstractDog();
        dog1.makeSound2();
        dog1.makeSound1();

//        모든 메서드가 abstract만 클래스를 인터페이스라고 한다.
        // 인터페이스는 클래스와 다르게 다중상속이 가능하다.
        // 인터페이스는 메서드의 구현부가 없고, 메서드 선언만 존재한다.
        // 인터페이스는 public abstract 키워드를 생략할 수 있다.
        // 인터페이스는 변수의 경우 public static final 키워드를 생략할 수 있다.
        // 인터페이스를 구현하는 클래스에서는 모든 메서드를 구현해야 한다.

//        인터페이스는 구현체가 없으므로, 기본적으로 별도의 객체 생성 불가
//        List<Integer> myList = new List<>();
    }
}

// 추상메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드를 붙이고, 추상클래스가 됨.
abstract class AbstractAnimal{
    void makeSound1() {
        System.out.println("동물이 소리를 냅니다.");
    }

//    메서드를 선언만하고 수현이 없는 메서드선언시 abstract키워드 사용.
    abstract void makeSound2();
}

class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound2() {
        System.out.println("개가 멍멍 소리를 냅니다.");
    }
}

// final은 상속 불가 클래스임.
final class FinalParents{

}
