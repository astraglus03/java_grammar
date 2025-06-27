package C08Thread;

public class Library {
    private static int bookCount = 100;
//    RDB에 재고관리를 할 경우에는 synchronized를 통한다 하더라도, 쿼리와 commit실행시점에 차이로 인해 동시성 이슈 발생.


//    synchronized 키워드를 사용하면, 해당 메서드가 동시에 여러 스레드에 의해 호출되지 않도록 함
//    synchronized를 사용하면 동시성 이슈 삭제
//    public synchronized static void borrow(){
    public static void borrow(){
        if(bookCount >0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bookCount-=1;
            System.out.println("대출 완료되었습니다.");
        }
        else{
            System.out.println("대출이 불가능 합니다.");
        }
    }

    public static int getBookCount(){
        return bookCount;
    }
}
