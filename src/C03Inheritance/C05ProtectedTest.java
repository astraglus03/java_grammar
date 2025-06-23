package C03Inheritance;

public class C05ProtectedTest {
    public static void main(String[] args) {
        C04ProtectedClass c4 = new C04ProtectedClass();
        System.out.println(c4.publicVar);
//        System.out.println(c4.privateVar); // private 변수는 같은 클래스 내에서만 접근 가능
        System.out.println(c4.defaultVar);
        System.out.println(c4.protectedVar);
    }
}
