package C05AnonymousLambda;

public class C01InnerClass {
    public static void main(String[] args) {
        MemberInnerClass mic = new MemberInnerClass();
        System.out.println(mic.getA());
        MemberInnerClass.StaticInnerClass sic = new MemberInnerClass.StaticInnerClass();
        sic.display();
    }
}

//(일반) 내부클래스
class MemberInnerClass{
    int a;

    MemberInnerClass(){
        this.a = 10;
    };

    int getA() {
        return a;
    }

//    static 내부클래스 : MemberInnerClass의 static 변수처럼 활용
    static class StaticInnerClass{
        int b =20;

        void display(){
            System.out.println(this.b);
        }
    }
}