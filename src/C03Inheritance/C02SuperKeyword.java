package C03Inheritance;

// 부모클래스를 상속받을때, 부모클래스에 기본생성자가 없으면 자식클래스에서 상속시 기본적으로 에러발생.
public class C02SuperKeyword extends SuperParents{
    public int a = 10;

    C02SuperKeyword(int a){
        super(a); // 부모클래스의 생성자를 호출하는 메서드
    }

    public static void main(String[] args) {
        C02SuperKeyword c2 = new C02SuperKeyword(30);
        System.out.println(c2.a);
        c2.display();
    }

    public void display(){
        System.out.println("자식의 변수" + a);
        System.out.println("부모의 변수" + super.a);
    }
}

class SuperParents{
    int a = 20;
    public SuperParents(int a){
        this.a = a;
    }
//    깡통 생성자가 필요함.
//    public SuperParents(){}
}
