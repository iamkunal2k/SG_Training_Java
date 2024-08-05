package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEg1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();

        queue.offer(48);
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println("Before : " +queue);
        queue.poll();
        System.out.println("After removing : "+queue);

        System.out.println("Peek : "+queue.peek());

        // Reversing

        Queue<Integer> queue1 = new PriorityQueue<>(Comparator.reverseOrder());

        queue1.offer(48);
        queue1.offer(12);
        queue1.offer(24);
        queue1.offer(36);

        System.out.println("Reverse Order : " +queue1);
    }
}
