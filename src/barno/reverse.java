package barno;

public class reverse {
    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
        System.out.println( reverse("   "));


    }
    public static String reverse(String str){

        String reversed ="";
        try {
            if (str.isEmpty() || str.isBlank()) {
                throw new IllegalArgumentException("Input string cannot be empty or blank.");
            }
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed += str.charAt(i);
            }
        } catch (IllegalArgumentException e) {
            System.out.println( e.getMessage());
            return null;

        }
        return reversed;
    }

}