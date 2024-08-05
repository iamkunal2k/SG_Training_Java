package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEg1 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(11);
        arr.add(12);
        arr.add(13);
        System.out.println("arr : "+arr);

        ArrayList<Integer> list = new ArrayList<>();

        list.add(14);

        System.out.println("List Before : "+list);
        list.addAll(arr);

        System.out.println("List after adding arr :");

        list.add(3, 50);
        System.out.println("List after adding 50 at 3 : ");

        for(Integer i : list) {
            System.out.println("List elemts : "+i);
        }

        list.remove(3);
        System.out.println("After removing 50 : "+list);

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }



}
