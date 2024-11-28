package Shahnoza;

public class FindUnique {

    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        System.out.println(findUnique("      "));
        System.out.println(findUnique(""));
        System.out.println(findUnique(null));
        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println(findUnique("AAABBBCCCDEF234"));

    }

    public static String findUnique(String str) {

        String unique = "";

        try {
            if (str == null || str.isEmpty() || str.isBlank()) {

                throw new IllegalArgumentException("Input can not be null, empty, blank ");
            }
        } catch (Exception e) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    unique += ch;
                }
            }
        }
            return unique;


    }
}
