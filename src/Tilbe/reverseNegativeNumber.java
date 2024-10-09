package Tilbe;

public class reverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverseNegativeNumbers(-35));
        System.out.println(reverseNegativeNumbers(-500));
        System.out.println(reverseNegativeNumbers(-123));
        System.out.println(reverseNegativeNumbers(-1538));
        System.out.println(reverseNegativeNumbers(23));
        System.out.println(reverseNegativeNumbers(0));


    }

    /**
 * This method reverses the digits of a negative number and returns it as an integer.
 *
 * @param num The negative number to be reversed.
 * @return The reversed negative number as an integer.
 *
 * <p>The function works by repeatedly extracting the last digit of the input number using the modulus operator (%),
 * and then appending it to the reversed number by multiplying the current reversed number by 10 and adding the extracted digit.
 * This process continues until all digits of the input number have been processed.
 *
 * <p>For example, if the input number is -35, the function will extract the digits 5 and 3,
 * and then return the reversed negative number -53.
 */
public static int reverseNegativeNumbers(int num){
    int reversed = 0;

    if (num >= 0) {
        throw new IllegalArgumentException("Number must be negative.");
    }
    while(num!=0){
        int remainder = num % 10;
        reversed = reversed * 10 + remainder;
        num = num / 10;
    }
    return reversed;
}

}
/*
  Write a return method that can reverse digits of a negative number and return it as int
  input: -35  output: -53
 */

