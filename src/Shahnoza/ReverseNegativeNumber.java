package Shahnoza;

public class ReverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static int reverseNegativeNumber(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return -reversedNum;
    }
}
