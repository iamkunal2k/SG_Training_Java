package String;

import java.sql.SQLOutput;

public class StringEg1 {

    public static void main(String[] args) {

        String str1 = "Kunal";
        String str2 = "Kumbhare";

        System.out.println("Concat : "+str1.concat(str2));

        System.out.println("Length of str1 : "+str1.length());

        System.out.println("Uppercase : "+str2.toUpperCase());
        System.out.println("Lowercase : "+str1.toLowerCase());

        System.out.println("Index of n : "+str1.indexOf("n"));
        System.out.println("Equals : "+str1.equals(str2));
        System.out.println("Empty : "+str1.isEmpty());


        String str3 = "Make your life a dream and your dream a reality";
        String regex = "[,\\.\\s]";
        String[] arr = str3.split(regex);

        for(String s : arr) {
            System.out.println(s);
        }
    }
}
