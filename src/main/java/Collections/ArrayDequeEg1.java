package Collections;

import java.util.ArrayDeque;

public class ArrayDequeEg1 {

    public static void main(String[] args) {

        // Gives the functionality to Add  or Remove elements in any position

        ArrayDeque<Integer> arr = new ArrayDeque<>();

        arr.offer(11);
        arr.offerFirst(12);
        arr.offer(13);
        arr.offerLast(14);

        System.out.println(arr);

        System.out.println("Normal Peek :"+arr.peek());
        System.out.println("Peek First : "+arr.peekFirst());
        System.out.println("Peek Last : "+arr.peekLast());

        System.out.println(arr.poll());
        System.out.println("poll : " +arr);

        System.out.println(arr.pollFirst());
        System.out.println("pollFirst : " +arr);

        System.out.println(arr.pollLast());
        System.out.println("pollLast : " +arr);



    }
}
