package day00_GroupClass.task_03;

import java.util.Arrays;

public class PermutationCombinations {

//    Array - permutation combinations
//    Given an array of 3 characters print all permutation combinations from the given characters

    public static void main(String[] args) {

        char[] abc = {'a','b','c'};


        for (int x = 0; x < abc.length; x++) {
            String word = abc[x] + "";

            for (int a = 0; a < abc.length; a++) {
                if (abc[x] != abc[a]) {
                    word += "" + abc[a];
                    if (word.length() == 3) {
                        System.out.print(word + " ");
                    }
                }
            }
        }

        for (int x = abc.length-1; x >= 0; x--) {
            String word = abc[x] + "";

            for (int a = abc.length-1; a >= 0; a--) {
                if (abc[x] != abc[a]) {
                    word += "" + abc[a];
                    if (word.length() == 3) {
                        System.out.print(word + " ");
                    }
                }
            }
        }

    }
}
