package Enum;

import java.util.Scanner;

enum Day {
    Sunday,
    Monday,
    Tuesday,
    Wednesday,
    thursday,
    Friday,
    Saturday;
}

public class EnumEg1 {

    Day day;

    public EnumEg1(Day day) {
        this.day = day;
    }

    public void dayisLike() {

        switch (day) {

            case Monday:
                System.out.println("Back to office");
                break;

            case Friday:
                System.out.println("Friday Night");
                break;

            case Saturday:
            case Sunday:
                System.out.println("Weekends");
                break;

            default:
                System.out.println("Weekdays");
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        EnumEg1 e1 = new EnumEg1(Day.valueOf(str));
        e1.dayisLike();

    }


}
