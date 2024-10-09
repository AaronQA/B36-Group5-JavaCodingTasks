package Gulnaz;
public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable
    public static void main(String[] args) {
        int a = -5, b = 0;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

        swap(a,b);
    }

//create a method for swapping two numbers without using a third variable
    public static void swap(int num1, int num2) {
        System.out.println("Before swapping: a = "+num1+", b = "+num2);
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swapping: a = "+num1+", b = "+num2);
    }

}
