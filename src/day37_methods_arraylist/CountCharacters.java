package day37_methods_arraylist;

public class CountCharacters {

    public static void main(String[] args) {

        String s = "1asdDWA9CE999d09ev90**9vs4dv";

        Boolean word = false;
        boolean number1 = false;

        if (Character.isDigit(s.charAt(0))) {
            word = true;
        }
        System.out.println(word);

        if (Character.isLetter(s.charAt(s.length() - 1))) {
            number1 = true;
        }
        System.out.println(number1);


        int upper = 0, lower = 0, number = 0, other = 0;
        String upperCase = "";

        for (int i = 0; i < s.length(); i++) {

            char letter = s.charAt(i);

            if (Character.isUpperCase(letter)) {
                upper++;
                upperCase += letter + " ";

            } else if (Character.isLowerCase(letter)) {
                lower++;

            } else if (Character.isDigit(letter)) {
                number++;

            } else {
                other++;
            }
        }

        System.out.println("Upper case: " + upper);
        System.out.println("Upper case: " + upperCase);
        System.out.println("Lower case: " + lower);
        System.out.println("Numbers: " + number);
        System.out.println("Other: " + other);
    }
}
