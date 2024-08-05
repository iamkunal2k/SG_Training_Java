package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEg1 {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(11);
        queue.offer(12);
        queue.offer(13);

        System.out.println("Before : "+queue);

        System.out.println("Peek Elem : "+queue.peek());

        queue.poll();
        System.out.println("After : "+queue);
    }
}
