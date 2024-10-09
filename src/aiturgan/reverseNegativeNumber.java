package aiturgan;

public class reverseNegativeNumber {

    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {

        System.out.println(reverseNegative(-35));
        System.out.println(reverseNegative(-10));
        System.out.println(reverseNegative(-107));
        System.out.println(reverseNegative(32));
        System.out.println(reverseNegative(-12));

    }

    public static int reverseNegative(int n) {
        if (n < 0) {
            int reversed = 0;

            while (n != 0) {
                int digit = n % 10;
                reversed = reversed * 10 + digit;
                n /= 10;
            }

            return reversed;
        }
        return 0;
    }


}