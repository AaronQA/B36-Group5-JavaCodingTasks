package Tilbe;

public class reverse {
    /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
    public static void main(String[] args) {
      System.out.println(reverseString("ABCD"));
      System.out.println(reverseString(""));
      System.out.println(reverseString("a b cde"));
      System.out.println(reverseString("#%?123"));
      System.out.println(reverseString(null));
      
    }
    public static String reverseString(String str) {
      String reverse = "";
      try {
        if (str == null || str.isBlank()) {
          throw new IllegalArgumentException("String cannot be null, empty, or blank!");
        }
        for (int i = str.length() - 1; i >= 0; i--) {
          reverse += str.charAt(i);
        }
      } catch (IllegalArgumentException e) {
        e.printStackTrace();
        return "Invalid";
      }
      
      return reverse;
    }

}