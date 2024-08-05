package Collections;

import java.util.Stack;

public class StackEg1 {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Tiger");
        stack.push("Lion");
        stack.push("Dog");
        stack.push("Cat");

        System.out.println("Stack : " + stack);

        System.out.println("Checking top elem :"+stack.peek());

        stack.pop();

        System.out.println("Stack After removing cat : " + stack);

        System.out.println(stack.peek());
    }
}
