package Josue;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 15;

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;


        System.out.println("Num1 original = 5 after swap = " + num1 + "\n Num2 original = 10 after swap = " + num2);

    }

    //Swap two int variables' values without using a third variable

}
