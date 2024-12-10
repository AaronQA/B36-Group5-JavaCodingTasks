package aiturgan;

public class reverse {
    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
        System.out.println(reverse("    "));
        System.out.println(reverse(""));
        System.out.println(reverse(null));
        System.out.println(reverse("A9B3U82"));

    }

    public static String reverse(String str) {
        String reverse = "";
        try {
            if (str == null) {
                throw new IllegalArgumentException("Input string cannot be null.");
            }
            for (int i = 0; i < str.length(); i++) {
                reverse = str.charAt(i) + reverse;
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            return null; // Return null in case of an error
        }
        return reverse;
    }



}
