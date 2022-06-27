package day24_loops;

public class CountChars {
    public static void main(String[] args) {

        String str = "12345qwertQWE3847qfhcq09euKJHVUGVvbjc0298h1o9cjRTY";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for(int i = 0; i < str.length(); i++){

            char letter = str.charAt(i);

            if(letter >= 'A' && letter <= 'Z'){
                upper++;
            } else if(letter >= 'a' && letter <= 'z'){
                lower++;
            }else if(letter >= '0' && letter <= '9'){
                number++;
            }

        }
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Numbers: " + number);
    }

}
