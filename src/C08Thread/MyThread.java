package C08Thread;

public class MyThread extends Thread{
//    Thread 클래스에 내장된 run메서드는 비어있는 메서드
//    run메서드는 스레드가 시작될 때 자동으로 호출되는 메서드
//    스레드 실행시 특정 작업을 수행하고 싶다면, run메서드를 Override해서 코드 작성
    @Override
     public void run(){
        for(int i=0;i<1000;i++){
            Library.borrow();
        }
        System.out.println("현재 남은 책의 수: " + Library.getBookCount());
    }
}
