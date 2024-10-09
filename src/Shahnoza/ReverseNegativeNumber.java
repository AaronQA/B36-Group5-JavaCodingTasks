package Shahnoza;


public class ReverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static int reverseNegativeNumber(int num) {
        int reversedNum = 0;
        if ( num>0){
            throw new IllegalArgumentException("Invalid negative number");
        }
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-35));
        System.out.println(reverseNegativeNumber(-105));
        System.out.println(reverseNegativeNumber(56));
    }
}
