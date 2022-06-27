package day00_other_school;

public class SmashWords {
    public static void main(String[] args) {

        String [] words2 = {"lol0", "gag1", "god2"};
        String [] words = {"lol", "gag", "god"};
        String s = "";

        System.out.println(String.join(" ", words2));

        for (int i = 0; i < words.length; i++) {
             s += words[i] + " ";
        }
         
        System.out.println(s.trim());
    }

}
