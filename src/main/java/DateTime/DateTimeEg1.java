package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.LocalDate.parse;

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

        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println("2017 is Leap year : "+date1.isLeapYear());

        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println("2016 is leap year : "+date2.isLeapYear());

        LocalDate md = LocalDate.parse("2024-02-03");
        System.out.println("Manually added date is : "+md);

        LocalTime mt = LocalTime.of(10,43,12);
        System.out.println("Manually added time is : "+mt);

        LocalTime mt2 = mt.minusHours(2);
        System.out.println("After removing 2 hr : "+mt2);

        OffsetDateTime of1 = OffsetDateTime.now();
        System.out.println("Current OFT : "+of1);

        System.out.println("Year : "+ OffsetDateTime.now().getYear()+
                " Month : "+OffsetDateTime.now().getMonth()+
                " Day : "+OffsetDateTime.now().getDayOfWeek());

    }
}
