package aiturgan;

import java.util.HashSet;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("AAA2223BB4BCCC"));
        System.out.println(removeDuplicates("AAABBBCCC!!@#@!!"));
        System.out.println(removeDuplicates("90009009989"));
        System.out.println(removeDuplicates("A A A B BB B CCCC"));
        System.out.println(removeDuplicates("                 !      "));

    }

    public static String removeDuplicates(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains("" + ch)) {
                result += ch;
            }
        }
        return result;
    }


}