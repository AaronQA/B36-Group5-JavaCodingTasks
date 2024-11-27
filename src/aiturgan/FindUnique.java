package aiturgan;

public class FindUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        System.out.println(findUnique("AAABBBCCCDEF"));
        System.out.println(findUnique("AAABBBCCCDEF234"));
        System.out.println(findUnique("      "));
    }

    public static String findUnique(String str){
        String uniqueChars = "";

        if(str == null || str.isEmpty() || str.isBlank()){
            throw new IllegalArgumentException("Input string can not be empty, null or blank");
        }else{
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    uniqueChars += ch;
                }
            }
        }

        return uniqueChars;
    }

}