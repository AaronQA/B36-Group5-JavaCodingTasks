package barno;

public class swapTwoNumbers {

    public static void main(String[] args) {
        int a = 0;
        int b = 5;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without a third variable
        a = a + b;  //  (15 + 5) a = 20
        b = a - b;  //  (20 - 5) b = 15
        a = a - b;  //  (20 - 15) a = 5

        System.out.println("After swapping: a = " + a + ", b = " + b);



        swapTwoNums(45,77);

    }

    public static void swapTwoNums(int a, int b){
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without a third variable
        a = a + b;
        b = a - b;
        a = a - b;


        System.out.println("After swapping: a = " + a + ", b = " + b);
    }



}




