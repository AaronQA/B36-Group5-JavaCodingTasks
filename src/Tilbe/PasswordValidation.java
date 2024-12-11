package Tilbe;

public class PasswordValidation {
  /*String -- Password Validation Task
  Write a return method that can verify if a password is valid or not.
  Requirements:
  1. Password MUST be at least have 6 characters and should not contain space
  2. PassWord should at least contain one upper case letter
  3. PassWord should at least contain one lowercase letter
  4. Password should at least contain one special characters
  5. Password should at least contain a digit
  if all requirements above are met, the method returns true, otherwise returns  false*/
  public static void main(String[] args) {
    System.out.println(isValid("aBc1?s"));
    System.out.println(isValid("@abcDe1"));
    System.out.println(isValid("Abc1!"));
    System.out.println(isValid("a       b"));
    System.out.println(isValid("           "));
    System.out.println(isValid(""));
    System.out.println(isValid(null));
  }
  
  public static boolean isValid(String password) {
    
    if (password == null || password.length() < 6 || password.contains(" ")) {
      return false;
    }
    
    boolean upperCase = false;
    boolean lowerCase = false;
    boolean digit = false;
    boolean specialChar = false;
    
    for (char ch : password.toCharArray()) {
      if (Character.isUpperCase(ch)) {
        upperCase = true;
      } else if (Character.isLowerCase(ch)) {
        lowerCase = true;
      } else if (Character.isDigit(ch)) {
        digit = true;
      } else if (!Character.isLetterOrDigit(ch)) {
        specialChar = true;
      }
    }
    return upperCase && lowerCase && digit && specialChar;
  }
}
