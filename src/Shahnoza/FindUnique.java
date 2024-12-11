package Shahnoza;

public class FindUnique {

    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        System.out.println(findUnique("      "));
//        System.out.println(findUnique(""));
//        System.out.println(findUnique(null));
//        System.out.println(findUnique("AAABBBCCCDEF"));
//        System.out.println(findUnique("AAABBBCCCDEF234"));

    }

    public static String findUnique(String str) {

       
        String unique = "";

        // Handle null, empty, or blank cases upfront
        if (str == null || str.isEmpty() || str.isBlank()) {
            System.out.println("Input is null, empty, or blank. Returning an empty string.");
            return unique; // Return an empty string
        }

        // Main logic to find unique characters
        try {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    unique += ch;
                }
            }
        } catch (Exception e) {
            // Log the exception for debugging
            System.err.println("An unexpected error occurred: " + e.getMessage());
        }

        return unique;
    }
}
