package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapEg1 {

    public static void main(String[] args) {

        Map<String, Integer> num = new HashMap<>();

        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);
        num.put("Four", 4);
        num.put("Five", 5);

        System.out.println("Before : " +num);

        num.remove("Four");
        System.out.println("After removing 4 : "+num);

        num.putIfAbsent("Two", 2);
        num.putIfAbsent("Six", 6);

        System.out.println("Put if Absent : "+num);

        System.out.println("Is empty : "+num.isEmpty());

        //EntrySet
        for(Map.Entry<String, Integer> e : num.entrySet()) {

            System.out.println("Key : "+e.getKey());
            System.out.println("Value : "+e.getValue());
        }
    }
}
