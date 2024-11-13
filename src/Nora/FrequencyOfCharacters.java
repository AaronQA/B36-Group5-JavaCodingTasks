package Nora;

import java.util.HashMap;

public class FrequencyOfCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/


        public static String FrequencyOfChars(String str) {
            // Create a HashMap to store the frequency of each character
            HashMap<Character, Integer> freqMap = new HashMap<>();

            // Loop through the string to count the frequency of each character
            for (char ch : str.toCharArray()) {
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }

            // StringBuilder to build the result string
            StringBuilder result = new StringBuilder();

            // Iterate through the frequency map to build the result in the desired format
            for (Character ch : freqMap.keySet()) {
                result.append(ch).append(freqMap.get(ch));
            }

            // Return the result as a string
            return result.toString();
        }

        public static void main(String[] args) {
            // Test the method
            System.out.println(FrequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
        }
    }

