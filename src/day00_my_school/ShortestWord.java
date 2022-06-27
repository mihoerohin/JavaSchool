package day00_my_school;


import java.util.Arrays;

public class ShortestWord {
    public static void main(String[] args) {

        String[] words = {"mother", "cat", "boss", "dog", "father", "trooper", "lol", "dablya"};

        String shortest = words [0];
        String shortest2 = "";
      
        for (int i = 1; i < words.length; i++) {
            if(words[i].length() < shortest.length()) {

                shortest = words[i];
            }
        }
        for(int s = 0; s < words.length; s++){
            if (shortest.length() == words[s].length()){
                 shortest2 += words[s] + " ";
            }
            
        }
        String[] sWords = shortest2.split(" ");

        System.out.println(Arrays.toString(sWords));
    }
}
