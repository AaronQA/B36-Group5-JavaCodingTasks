package Shahnoza;

public class FindUnique {

    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println(findUnique("AAABBBCCCDEF234"));
        System.out.println(findUnique("      "));
        System.out.println(findUnique(""));
        System.out.println(findUnique(null));
    }

    public static String findUnique(String str) {

        String unique = "";

        if (str == null || str.isEmpty() || str.isBlank()) {

            throw new IllegalArgumentException("Input can not be null, empty, blank ");
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                unique += c;
            }
        }
        return unique;
    }
}
