package nadira;


import java.util.Arrays;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {

        System.out.println("minNumberFromArray = " + minNumberFromArray(99, 12, 23, 32, 44, 57, 6));
    }


    public static int minNumberFromArray(int... arr) {

        int minNumber = arr[0];
        for (int each : arr) {
            if (minNumber > each) {
                minNumber = each;

            }

        }
        return minNumber;

    }
}