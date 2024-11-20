package Shahnoza;

public class FrequencyOfCharacters {

    /*
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


    public static String getFrequencyOfChars(String str) {
        String result = "";
        int length = str.length();

        if ( str==null || str.isBlank() || str.isEmpty()){
            throw new IllegalArgumentException("String can not be null, empty or blank!");
        }

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int count = 0;


            if (result.contains(String.valueOf(currentChar))) {
                continue;
            }


            for (int j = 0; j < length; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }


            result += currentChar + String.valueOf(count);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFrequencyOfChars("AABBCCC"));
        System.out.println(getFrequencyOfChars("AAABBCDD"));
        System.out.println(getFrequencyOfChars("aaaaaBBccDDDDD"));
        System.out.println(getFrequencyOfChars("a    b    cccc  d"));
        System.out.println(getFrequencyOfChars("1222233$$@@@@!!!"));
        System.out.println(getFrequencyOfChars("  "));
        System.out.println(getFrequencyOfChars(null));

    }
}
