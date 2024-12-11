package Shahnoza;

public class PasswordValidation {

    /*
    /*String -- Password Validation Task
    Write a return method that can verify if a password is valid or not.
    Requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false
    */

    public static boolean validPassword(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;



        for (char eachCh : password.toCharArray()) {
            if (Character.isUpperCase(eachCh)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(eachCh)) {
                hasLowerCase = true;
            } else if (!Character.isLetterOrDigit(eachCh)) {
                hasSpecialChar = true;
            } else if (Character.isDigit(eachCh)) {
                hasDigit = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

    public static void main(String[] args) {
        System.out.println("S@cydeo24 = " + validPassword("S@cydeo24"));
        System.out.println("S @cydeo24 = " + validPassword("S @cydeo24"));
        System.out.println("S@cyd = " + validPassword("S@cyd"));
    }
}
