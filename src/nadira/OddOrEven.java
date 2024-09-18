package nadira;

public class OddOrEven {
    public static void main(String[] args) {


        System.out.println(identify(7));
    }
       /*Write  a method which can identify given int number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/


    public static String identify(int number) {

        if (number >= 0) {

            if (number % 2 == 0) {
                return "Even";

            }else{
                return "Odd";
            }


        }
        return "invalid input, please enter a positive number";
    }
}