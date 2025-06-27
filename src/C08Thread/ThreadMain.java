package C08Thread;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
////        단일스레드 실행.
//        for(int i=0; i<1000;i++){
//            Library.borrow();
//        }
//        System.out.println(Library.getBookCount());

////        멀티스레드 생성 방법
////        방법 1: 스레드 클래스 상속 방식
//        MyThread t1 = new MyThread();
//        MyThread t2 = new MyThread();
//        MyThread t3 = new MyThread();
//        MyThread t4 = new MyThread();
////        Thread클래스안에 start메서드 내장되어있고, start메서드는 run메서드 호출하면서 스레드 발생
////        Thread는 동시에 실행되기 때문에, 순서가 보장되지 않음
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        System.out.println("helloWorld");

//        방법 2: Runnable을 직접 구현한 객체를 Thread클래스 생성자에 주입하는 방식

//        new Thread(() -> {System.out.println("스레드 1 시작");}).start();
//        new Thread(() -> {System.out.println("스레드 2 시작");}).start();
//        new Thread(() -> {System.out.println("스레드 3 시작");}).start();
//        new Thread(() -> {System.out.println("스레드 4 시작");}).start();
//        System.out.println("helloWorld");

        for(int i=0; i<1000; i++){
            Thread t1 = new Thread(Library::borrow);
            t1.start();
            t1.join(); // 한스레드의 작업이 모두 완료될 때, 다른 스레드 생성하여 작업 수행. -> 사실상 단일 스레드처럼 동작되므로, 성능 저하 발생.

        }
        Thread.sleep(20000);
        System.out.println(Library.getBookCount());
    }
}