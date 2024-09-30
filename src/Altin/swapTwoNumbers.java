package Altin;

public class swapTwoNumbers {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without a third variable
        a = a + b;  // a now becomes 15 (5 + 10)
        b = a - b;  // b now becomes 5 (15 - 10)
        a = a - b;  // a now becomes 10 (15 - 5)

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
