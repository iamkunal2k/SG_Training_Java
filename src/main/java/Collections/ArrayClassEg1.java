package Collections;

import java.util.Arrays;

public class ArrayClassEg1 {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int index = Arrays.binarySearch(numbers, 4);

        System.out.println("The index of element 4 in the array is " + index);

        Integer[] numbers2 = { 10, 2, 32, 12, 15, 76, 17, 48, 79, 9 };

        System.out.println("Before sorting : ");
        for(int n : numbers2) {
            System.out.print(" "+n);
        }

        Arrays.sort(numbers2);

        System.out.println("\n Sorted array : ");
        for(int n : numbers2) {
            System.out.print(" "+n);
        }

        Arrays.fill(numbers2, 12);
        System.out.println("\n Array Fill : ");
        for(int n : numbers2) {
            System.out.print(" "+n);
        }



    }
}
