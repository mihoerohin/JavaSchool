package day00_GroupClass.task_01;

public class RemoveDuplicates {
    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBBCCCCDDDEFFFF"));
    }
    public static String removeDuplicates(String word){

        String str = "";

        for (int i = 0; i < word.length()-1; i++) {

            if(word.charAt(i) != word.charAt(i + 1)){
                str += word.charAt(i+1);
            }
        }
        return word.charAt(0) + str;
    }
}
