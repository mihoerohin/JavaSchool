package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        System.out.println();
        

        String s = "today is monday";
        String[] words = s.split(" ");

        String reversed = "";
        
        System.out.println("today is monday");

        for(int i = words.length - 1; i >= 0; i--){
            reversed += words[i] + " ";

        }
        System.out.println(reversed.trim());

    }
}
