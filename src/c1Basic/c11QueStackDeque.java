package c1Basic;

import java.util.*;
import java.io.*;
import java.util.concurrent.ArrayBlockingQueue;

public class c11QueStackDeque {
    public static void main(String[] args) {
        // 큐(Queue)와 스택(Stack), 덱(Deque)의 사용 예시

        // 큐: FIFO(First In First Out) 구조
        // Queue인터페이스를 LinkedList'가 구현한 아래와 같은 방식 많이 사용
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
//        System.out.println(queue.poll());
////        peak() 메서드는 큐의 첫 번째 요소를 반환하지만 제거하지 않음
//        System.out.println(queue.peek());
//        System.out.println(queue);

////        LinkedList와 ArrayList 성능차이 비교
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for(int i=0; i<1000000; i++){
//            linkedList.add(0,i);
//        }
//
//        List<Integer> arrayList = new ArrayList<>();
//        for(int i=0; i<1000000; i++){
//            arrayList.add(0,i);
//        }


//        Queue<String> queue = new LinkedList<>();
//        queue.add("문서1");
//        queue.add("문서2");
//        queue.add("문서3");
//        queue.add("문서4");
//
//        while(!queue.isEmpty()){
//            System.out.println(queue.poll());
//        }

        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);

//        // ArrayBlockingQueue는 고정된 크기의 큐로, 최대 크기를 지정해야 함 오류 발생
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4");

////        offer: 길이제한될경우 제한된 길이까지만 insert
//        blockingQueue.offer("문서1");
//        blockingQueue.offer("문서2");
//        blockingQueue.offer("문서3");
//        blockingQueue.offer("문서4");
//
//        System.out.println(blockingQueue);

//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(10);
//        pq.add(20);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); // add할때까지는 전체 정렬이 돼 있지 않음.
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll()); // poll할때마다 최솟값을 뽑아낸다.
//        }

//        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        pq.add(30);
//        pq.add(10);
//        pq.add(20);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); // add할때까지는 전체 정렬이 돼 있지 않음.
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll()); // poll할때마다 최솟값을 뽑아낸다.
//        }


//        // 스택: LIFO(Last In First Out) 구조
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println("스택의 마지막 요소: " + stack.pop()); // 3
//        System.out.println("스택의 다음 요소: " + stack.pop()); // 2

//        deque: addFirst, addLast, removeFirst, removeLast, pollStart, pollLast,peekFrist, peekLast 메서드를 사용하여 양쪽 끝에서 삽입과 삭제가 가능

//        // 덱: 양쪽 끝에서 삽입과 삭제가 가능한 자료구조
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1);
//        deque.addLast(2);
//        deque.addLast(3);
//        System.out.println("덱의 첫 번째 요소: " + deque.removeFirst()); // 1
//        System.out.println("덱의 마지막 요소: " + deque.removeLast()); // 3
    }
}
