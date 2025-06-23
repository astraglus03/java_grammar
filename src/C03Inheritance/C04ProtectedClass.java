package C03Inheritance;

// class에는 public, default 접근제어자만 사용 가능
public class C04ProtectedClass {
    //    변수, 메서드에는 4가지 접근제어자 사용 가능
//    public : 프로젝트 전체에서 접근가능(다른패키지여도 가능)
//    private : 클래스 내부에서만 접근가능
//    default : 같은 패키지내에서만 접근가능(접근제어자 미지정시 default)
//    protected : 패키지를 벗어나더라도 상속관계인경우에는 접근가능
    public String publicVar = "public 접근제어자";
    private String privateVar = "private 접근제어자";
    String defaultVar = "default 접근제어자";
    protected String protectedVar = "protected 접근제어자";

    public static void main(String[] args) {

    }
}
