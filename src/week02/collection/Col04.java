package week02.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col04 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, peek, poll
        // Queue : 생성자가 없는 인터페이스 <-

        Queue<Integer> intQue = new LinkedList<>(); //Queue를 선언, 생성

        intQue.add(1);
        intQue.add(5);
        intQue.add(9);

        while (!intQue.isEmpty()) {
            System.out.println(intQue.poll());
        }

        // 추가
        intQue.add(1);
        intQue.add(5);
        intQue.add(9);
        intQue.add(10);

        // peak
        System.out.println(intQue.peek());
        System.out.println(intQue.size());
    }
}
