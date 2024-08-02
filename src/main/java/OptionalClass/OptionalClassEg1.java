package OptionalClass;

import java.util.Optional;

public class OptionalClassEg1 {

    public static void main(String[] args) {
        String[] str = new String[10];
        Optional<String> checkNull = Optional.ofNullable(str[5]);
        System.out.println(checkNull);

        if(checkNull.isPresent()){
            String lowercaseString = str[5].toLowerCase();
            System.out.print(lowercaseString);
        }else
            System.out.println("Empty Sting");


        //2nd Example

        str[5] = "EXAMPLE" ;

        System.out.println(checkNull.get());
    }

}

