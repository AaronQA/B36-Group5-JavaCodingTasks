package Tilbe;
public class swapTwoNumbers {
    public static void main(String[] args) {
        swapNums(5,10);
    }
     public static void swapNums(int num1,int num2){
         num1 = num1 + num2;
         num2 = num1 - num2;
         num1 = num1 - num2;
         System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);
     }
}
