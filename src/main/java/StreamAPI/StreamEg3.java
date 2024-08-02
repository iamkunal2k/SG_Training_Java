package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEg3 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.
                asList(3,4,56,7);

        List<Integer> list2 = Arrays.asList(4,5,6,87,98);

        List<List<Integer>> listfinal = Arrays.asList(list1, list2);

        System.out.println("before: "+listfinal);

        List<Integer> listvf = listfinal.stream().flatMap(s -> s.stream()).collect(Collectors.toList());

        System.out.println("After: "+listvf);

        //all match
        boolean match2 = listvf.stream().allMatch( n -> n/2==0);
        System.out.println(match2);

        boolean match3 = listvf.stream().noneMatch(n -> n/2 == 0);
        System.out.println(match3);

        Optional<Integer> temp  = listvf.stream().findFirst();

        if(temp.isPresent()) {
            System.out.println(temp.get());
        }
        else System.out.println("Value is not present");
    }
}
