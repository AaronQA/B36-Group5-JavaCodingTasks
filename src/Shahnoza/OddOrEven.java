package Shahnoza;

public class OddOrEven {
       /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void main(String[] args) {
        System.out.println(oddEven(5));
        System.out.println(oddEven(6));
    }
    public static String oddEven(int num) {
        if(num%2==0){
            return "Even";
        }else {
            return "Odd";
        }
    }


}
