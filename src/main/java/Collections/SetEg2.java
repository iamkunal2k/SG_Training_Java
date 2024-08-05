package Collections;

import java.util.HashSet;
import java.util.Set;

public class SetEg2 {

    public static void main(String[] args) {

        Set<Employe> empset = new HashSet<>();
        empset.add(new Employe("Kunal", 1));
        empset.add(new Employe("Krishna", 2));
        empset.add(new Employe("Kanha", 4));
        empset.add(new Employe("karna", 2));

        System.out.println(empset);

        Employe e1 = new Employe("Kunal",2);
        Employe e2 = new Employe("Karna", 2);

        System.out.println(e1.equals(e2));
        System.out.println(empset);
    }
}
