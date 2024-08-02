package LambdaExpression;

import java.util.ArrayList;

interface A {
    void show(int i);
}

interface B {
    int add(int a, int b);
}

public class LambdaEx1 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(3);
        arr.add(4);
        arr.add(5);

        arr.forEach(n -> System.out.println(n));

//        A a = new A() {
//            @Override
//            public void show(int i) {
//                System.out.println();
//            }
//        };
//        a.show(3);

        A a1 = (i) -> System.out.println("Value : "+ i);
        a1.show(3);

        B b1 = (a,b) -> {
            return a + b;
        };

        int sum = b1.add(3,4);
        System.out.println("Sum is : "+sum);
    }



}
