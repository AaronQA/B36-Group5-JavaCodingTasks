package Altin;


public class Finra {
    public static void main(String[] args) {
        printFinRa();
    }

    public static void printFinRa() {
        for (int i = 1; i <= 30; i++) {
            String result = "";

            if (i % 3 == 0) {
                result += "FIN";
            }
            if (i % 5 == 0) {
                result += "RA";
            }

            // If neither condition applies, print the number
            if (result.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(result);
            }
        }
    }
}