package c02ClassBasic;

public class c01Method {
    public static void main(String[] args) {
//        클래스 메서드 기본호출방식: 클래스명.메서드명(매개변수들);
        int res = c01Method.sum(10,20);
    }

//    접근제어자(public), 클래스메서드(static O) / 객체메서드(static X), 반환타입
    public static int sum(int start, int end){
        int total = 0;
        for (int i = start; i < end; i++) {
            total += i;
        }
        return total;
    }
}
