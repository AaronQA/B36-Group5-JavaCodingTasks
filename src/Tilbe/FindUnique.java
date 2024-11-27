package Tilbe;

import java.util.Arrays;
import java.util.Collections;

public class FindUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
    public static void main(String[] args) {
      System.out.println(unique("AAABBBCCCDEF"));
      System.out.println(unique("@@@$1888???"));
      System.out.println(unique("aaa bcdeefgg"));
      System.out.println(unique(null));
      System.out.println(unique(""));
      System.out.println(unique("        "));
      System.out.println(uniqueChars("AAAbCddEEf"));
      
    }
  
  public static String unique(String str) {
    String result = "";
    if(str==null || str.isBlank()){
      throw new IllegalArgumentException("String can not be null, empty or blank!");
    }
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (str.indexOf(ch) == str.lastIndexOf(ch)) {
        result += ch;
      }
    }
    return result;
  }
  
  public static String uniqueChars(String str) {
    String result = "";
    if(str==null || str.isBlank()){
      throw new IllegalArgumentException("String can not be null, empty or blank!");
    }
    for (String each : str.split("")) {
      int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
      if (frequency == 1) {
        result += each;
      }
    }
    return result;
  }
}