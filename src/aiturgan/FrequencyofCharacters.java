package aiturgan;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }

    public static String frequencyOfCharacters(String str) {
        String result = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }
            }
            if (result.contains("" + ch)) {
                continue;
            }
            result += ch + "" + count;
        }
        return result;

    }

}