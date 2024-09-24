package barno;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(45));
        System.out.println(oddOrEven(6));
    }

    public static String oddOrEven(int num) {
        return num % 2 == 0? "even" : "odd";
    }

}
