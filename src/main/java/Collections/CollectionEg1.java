package Collections;

import java.util.*;

public class CollectionEg1 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(8);
        list.add(8);
        list.add(8);
        list.add(76);
        list.add(29);
        list.add(75);

        System.out.println("min element " + Collections.min((list)));
        System.out.println("max element " + Collections.max(list));
        System.out.println(Collections.frequency(list, 8));

        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);


        // Example Employee
        List<Employe> empset = new ArrayList<>();
        empset.add(new Employe("Kunal", 1));
        empset.add(new Employe("Krishna", 2));
        empset.add(new Employe("Kanha", 4));
        empset.add(new Employe("karna", 3));

        System.out.println(empset);

        Employe e1 = new Employe("Kunal",2);
        Employe e2 = new Employe("Karna", 3);

        System.out.println((e1.compareTo(e2)));

        Collections.sort(empset);
        System.out.println(empset);

    }
}
