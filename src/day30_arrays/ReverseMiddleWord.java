package day30_arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        System.out.println();


        String s = "java always fun";
        String[] words = s.split(" ");
        String reverse = "";
        char[] middleWord = words[1].toCharArray();

        for (int i = middleWord.length - 1; i >= 0; i--){

            reverse += middleWord[i];
        }

        System.out.println(words[0] + " " + reverse + " " + words[2]);
    }

}
