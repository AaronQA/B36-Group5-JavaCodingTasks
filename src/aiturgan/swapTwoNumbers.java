package aiturgan;
public class swapTwoNumbers {

    public static void main(String[] args) {

        swapping(8,4);
        swapping(45672,389);
        swapping(-3,-4);

    }

    //Swap two int variables' values without using a third variable

    public static void swapping(int a, int b){

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After  swapping: a = " + a + ", b = " + b);
    }

}
