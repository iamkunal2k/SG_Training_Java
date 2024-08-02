package MethodRefererences;
import java.util.ArrayList;

@FunctionalInterface
interface printable {

    public void display();
}


public class MethodRefEx1 {

    public void greet() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        MethodRefEx1 MR = new MethodRefEx1();

        printable p = MR::greet;
        p.display();

        // @2nd Example

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr.stream().forEach(System.out::println);
    }



}
