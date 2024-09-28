package nadira;
public class swapTwoNumbers {
    //Swap two int variables' values without using a third variable
    public static void main(String[] args) {

        int a = 5;
        int b =10;
        System.out.println("a = "+a+" "+"b = "+b);
        a = a+b;
        b = a-b ;
        a = a-b;

        System.out.println("a = "+a+" "+"b = "+b);
    }
}
