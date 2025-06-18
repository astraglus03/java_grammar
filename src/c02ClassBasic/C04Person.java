package c02ClassBasic;

public class C04Person {
//    private 접근제어자는 해당 클래스내에서만 접근 가능
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정


    private String name; // 이름
    private String email; // 이메일
    private int age; // 나이

    // 메서드는 public하게 별도로 만들어서 의도를 명확히 하여, 변수의 안정성 향상
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("나이는 음수일 수 없습니다.");
        }
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAge(){
        return age;
    }

    public String printPerson(){
        return "이름은: " + name + ", 이메일은: " + email + ", 나이는: " + age + "세입니다.";
    }

//    객체 메서드들끼리의 호출은 객체가 만들어져있다는것을 가정하고 있으므로, 문제없이 호출 가능.
    public String printPerson2(){
        String temp = this.printPerson();
        return temp;
    }

////    클래스메서드는 기본적으로 객체생성을 가정하지 않으므로, 클래스메서드내에서 객체메서드를 호출하는것은 논리적 모순.
//    public static String printPerson3(){
//        String temp = this.printPerson(); // 불가능
//        return null;
//    }
}
