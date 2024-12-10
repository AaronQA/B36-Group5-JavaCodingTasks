package aiturgan;

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
        System.out.println(isValidPassword("Hel1oWorld!"));
        System.out.println(isValidPassword("hello"));
        System.out.println(isValidPassword("HELLO123"));
        System.out.println(isValidPassword("World123"));
        System.out.println(isValidPassword("world123!"));
        System.out.println(isValidPassword("World123!"));
        System.out.println(isValidPassword(null));
        System.out.println(isValidPassword("     "));
    }

    public static boolean isValidPassword(String password) {
        try {
            if (password == null) {
                throw new IllegalArgumentException("Password cannot be null");
            }

            if (password.length() < 6 || password.contains(" ")) {
                throw new IllegalArgumentException("Password must be at least 6 characters long and must not contain spaces");
            }

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }


            if (!hasUpperCase || !hasLowerCase || !hasDigit || !hasSpecialChar) {
                throw new IllegalArgumentException("Password doesn't match the criteria. Please try again!");
            }
            return true;

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid password: " + e.getMessage());
            return false;
        }

    }

}