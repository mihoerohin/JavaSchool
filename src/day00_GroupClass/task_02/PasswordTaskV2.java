package day00_GroupClass.task_02;

public class PasswordTaskV2 {
    public static void main(String[] args) {

        System.out.println(passValidation("Miho@mail.com"));
    }

    public static boolean passValidation(String str) {
        boolean result = false;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isSpace = false;
        boolean isSpecial = false;


        if (str.length() >= 6) {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    isUpper = true;
                }
                if (Character.isLowerCase(str.charAt(i))) {
                    isLower = true;
                }
                if (Character.isWhitespace(str.charAt(i))) {
                    isSpace = true;
                }
                if (!Character.isDigit(str.charAt(i))) {
                    isSpecial = true;
                }
            }
            if (isUpper & isLower & isSpecial & !isSpace) {
                result = true;
            }
        }
        return result;
    }
}
