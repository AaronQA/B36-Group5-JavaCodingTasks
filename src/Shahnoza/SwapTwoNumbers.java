package Shahnoza;

public class SwapTwoNumbers {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        System.out.println("first a: " + a);
        System.out.println("first b: " + b);

        a = a + b; //a is 15 now
        b = a - b; //b is 5 now
        a = a - b; //a is 10 now

        System.out.println("new a: " + a);//new a: 10
        System.out.println("new b: " + b);//new b: 5

    }
}
/*
Swap two int variables' values without using a third variable
 */
