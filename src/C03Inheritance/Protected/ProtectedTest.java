package C03Inheritance.Protected;
// 같은 패키지내의 클래스가 아닌경우에는 import 필요함.
// 패키지 바로 하위의 모든 class는 *로 import 가능.
// 다만, 패키지내의 패키지만의 class는 *로 import 불가

import C03Inheritance.C04ProtectedClass;

public class ProtectedTest extends C04ProtectedClass {
    public static void main(String[] args) {
        ProtectedTest c4 = new ProtectedTest();
        c4.publicVar = "public 접근제어자 변경";
        // 패키지가 달라져서 접근제어 불가능
//        c4.defaultVar = "default 접근제어자 변경";
//        상속관계가 있을경우, 패키지가 달라도 protected 접근제어자 사용 가능
        c4.protectedVar = "protected 접근제어자 변경";

        C04ProtectedClass c4_1 = new C04ProtectedClass();
//        p4_1은 부모클래스의 객체이므로, 상속관계가 있는 객체가 아니므로, protected변수에 접근 불간으.

    }
}
