package Shahnoza;

public class RemoveDuplicate {

    public static String removeDuplicates(String str) {
        String result = "";
        if ( str==null || str.isBlank()){
            throw new IllegalArgumentException("String can not be null, empty or blank!");
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!result.contains(ch + "")) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("AAA2223BB4BCCC"));
        System.out.println(removeDuplicates(""));
        System.out.println(removeDuplicates("        "));
        System.out.println(removeDuplicates(null));

    }

}
