package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetEg1 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);

        System.out.println("Before : "+set);

        set.remove(54);

        System.out.println("After removing 50 : "+set);

        System.out.println("Check if 21 is present : "+set.contains(21));

        System.out.println("Check if empty : "+set.isEmpty());

        System.out.println("Size : "+set.size());

        set.clear();

        System.out.println("After Clearing : "+set);

    }
}
