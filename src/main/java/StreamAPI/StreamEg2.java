package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEg2 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jai");
        names.add("Mahesh");
        names.add("Ajay");
        names.add("Hemant");
        names.add("Vishal");

        long count = names.stream().filter(s -> s.length() < 5).count();
        System.out.println(count);

        names.stream().flatMap(s -> Stream.of(s.charAt(2))).forEach(System.out::println);

        //Anynames

        boolean match1 = names.stream().anyMatch(s -> s.contains("Vishal"));
        System.out.println(match1);

    }
}
