package day30_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {


        String [] words = {"java", "long word", "civic", "apple", "racecar", "mom", "anna", "tororot"};
        String longestPalindrome = "";


        for(String eachWord : words){      // eachWord == words[i]
            boolean isPalindrome = true;

            for(int i = 0; i < eachWord.length()/2; i++){

                if(eachWord.charAt(i) != eachWord.charAt(eachWord.length() - 1 - i)){
                    isPalindrome = false;
                    break;
                }

            }
           if(isPalindrome && eachWord.length() > longestPalindrome.length()){
               longestPalindrome = eachWord;

           }   continue;

        }

        System.out.println(longestPalindrome);

    }
}
