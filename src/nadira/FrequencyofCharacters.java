package nadira;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


    public static void main(String[] args) {

        System.out.println("frequencyOfCharacters(\"AAABBCDD\") = " + frequencyOfCharacters("AAABBCDD"));


    }
public static  String frequencyOfCharacters(String word) {

    String result = "";

    for (int i = 0; i < word.length(); i++) {

        if (result.contains("" + word.charAt(i))) {
            continue;
        }

        int count = 0;
        for (int j = 0; j < word.length(); j++) {
            if (word.charAt(i)== word.charAt(j)) {
                count++;
            }
        }

        result += word.charAt(i)+ "" + count;
    }

    return result;
}

    }

