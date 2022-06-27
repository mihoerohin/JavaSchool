package day26_nested_loops;

public class FrequencyOfCharacter {
    public static void main(String[] args) {


        String word = "aaabbbcddddeeeeeeeeefffgggg";
        String check = "";

        for(int i = 0; i < word.length(); i++){

            int count = 0;
            char letter = word.charAt(i);

            if(check.contains("" + letter)){
                continue;

            }

            for(int j = 0; j < word.length(); j++){

                char eachLetter = word.charAt(j);

                if(letter == eachLetter){
                    count++;
                }

            }     //end of the inner loop

            System.out.println(letter + " - " + count);
            check += letter;

        }





    }
}
