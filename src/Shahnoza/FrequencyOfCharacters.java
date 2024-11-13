package Shahnoza;

public class FrequencyOfCharacters {

    /*
    Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */


    public static String getFrequencyOfChars(String str) {
        String result = "";
        int length = str.length();

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Skip already processed characters
            if (result.contains(String.valueOf(currentChar))) {
                continue;
            }

            // Count occurrences of the current character
            for (int j = 0; j < length; j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Concatenate the character and its frequency to the result string
            result += currentChar + String.valueOf(count);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(getFrequencyOfChars("AABBCCC"));

    }
}
