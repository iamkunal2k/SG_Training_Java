package MethodRefererences;

import java.util.Arrays;
import java.util.List;

class utility {

    public static void printMsg(String message) {
        System.out.println("Have a good day!!!");
    }
}

public class MethodRefStatic {

    public static void main(String[] args) {

        List<String> message = Arrays.asList("Hello", "Hola", "Hii");
        message.forEach(utility::printMsg);
    }

}
