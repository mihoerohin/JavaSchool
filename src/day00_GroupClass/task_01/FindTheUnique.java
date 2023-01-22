package day00_GroupClass.task_01;

public class FindTheUnique {

    public static void main(String[] args) {
//
        System.out.println(uniqueChar2("AAABBBCCDDDEFFFMTTTTOPPPPPPN"));
        System.out.println(uniqueChar2("PUBLIC STATIC VOID MAIN"));
        System.out.println();
        System.out.println(findUnique("AAABBBCCDDDEFFFMTTTTOPPPPPPN"));
    }


    public static String findUnique(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            char x = str.charAt(i);

            if (str.indexOf(x)==str.lastIndexOf(x)){
                unique += x;
            }
        }
        return unique;
    }








    public static String uniqueChar2(String word) {

        String uniqueChar2 = "";

        for (int i = 0; i < word.length(); i++) {

            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {
                uniqueChar2 += word.charAt(i);
            }
        }
        return uniqueChar2;
    }
}
