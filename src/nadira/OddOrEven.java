package nadira;

public class OddOrEven {
    public static void main(String[] args) {


        System.out.println("identify(5) = " + identify(5));
    }
       /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/




    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";

        }
        if (number % 2 != 0) {
            return "Odd";
        }
        return "invalid input, please enter a number";

    }
}
