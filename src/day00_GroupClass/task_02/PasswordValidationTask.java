package day00_GroupClass.task_02;

public class PasswordValidationTask {
    /*
    String - Password Validation Task
Write a return method that can verify if a password is valid or not. Requirements:
 +   1. Password MUST be at least 6 characters and should not contain space
 +   2. Password should at least contain one upper case letter
 +   3. Password should at least contain one lowercase letter
 +   4. Password should at least contain one special characters
 +   5. Password should at least contain a digit
 +   6. if all requirements above are met, the method returns true, otherwise returns false
     */
    public static void main(String[] args) {
        System.out.println(Pass("Cydeo26@gmail.com"));

}
    public static boolean Pass(String password) {

        boolean result = true;


        if ((password.length() - 1) < 6 || password.contains(" ")){  // Password MUST be at least 6 characters and should not contain space
            result = false;
        }

        int upperChar = 0;
        int lowerChar = 0;
        int nums = 0;

        for (int i = 0; i < password.length(); i++) {       // loop for 'password'

            for (char upper = 'A'; upper <= 'Z'; upper++) {     // count UpperCase
                if (password.charAt(i) == upper){
                    upperChar++;
                }
            }
            for (char lower = 'a'; lower <= 'z'; lower++) {     // count LowerCase
                if (password.charAt(i) == lower){
                    lowerChar++;
                }
            }
            for (char n = '0'; n <= '9'; n++) {                 // count digit
                if (password.charAt(i) == n){
                    nums++;
                }
            }
        }

        int specialChar = password.length() - upperChar - lowerChar - nums ;         // count special characters

        if(upperChar == 0 || lowerChar == 0 || nums == 0 || specialChar == 0){        //
            result = false;
        }


        return result;
    }
}
