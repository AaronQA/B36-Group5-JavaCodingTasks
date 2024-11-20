package Tilbe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
  /*Write a return method that can remove the duplicated values from String
      Ex:  removeDup("AAABBBCCC")  ==> ABC*/
  public static void main(String[] args) {
    System.out.println(removeDup("AAABBBCCC"));
    System.out.println(removeDup("AA     BBbBC  dddDD  E"));
    System.out.println(removeDup("@@@??1122??!!!%**"));
    System.out.println(removeDup(""));
    System.out.println(removeDup("        "));
    System.out.println(removeDup(null));
    System.out.println(removeDuplicates("AAAbbbb$$$444"));
  }
  
  public static String removeDup(String str) {
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
  
  public static Set<Character> removeDuplicates(String str) {
    Set<Character> result = new HashSet<>();
    if ( str==null || str.isBlank()){
      throw new IllegalArgumentException("String can not be null, empty or blank!");
    }
    for (char each : str.toCharArray()) {
      result.add(each);
    }
    return result;
  }
}