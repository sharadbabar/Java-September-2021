package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);


        System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue.offer(60));
        System.out.println(queue.poll());
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
