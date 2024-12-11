package Shahnoza;

public class Reverse {


    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String reverse1(String str){
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        //System.out.println(reverse("ABCD"));
        System.out.println(reverse1("ABCD"));
    }
}
