package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeEg1 {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Before Formatting : "+dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String FormatedDate = dt.format(dtf);
        System.out.println("After Formatting : "+FormatedDate);

        LocalDate date = LocalDate.now();
        System.out.println("Date : "+date);

        Date d1 = new Date();
        System.out.println(d1);

    }
}
