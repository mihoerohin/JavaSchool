package day29_Arrays;

public class LongestAndShortestString {
    public static void main(String[] args) {



        String[] strs = {"apple", "java", "computer", "water"} ;
        String longest = strs[0];
        String shortest = strs[0];

        for(int i = 0; i < strs.length; i++){

            if(strs[i].length() > longest.length()){
                longest = strs[i];
            }

            if(strs[i].length() < shortest.length()){
                shortest = strs[i];
            }
        }

        System.out.println("longest: " + longest);
        System.out.println("shortest: " + shortest);

    }


}
