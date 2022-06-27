package day33_methods;

public class LastCharacters2D {
    public static void main(String[] args) {

        String[][] words = {{"James", "is", "back"}, {"He", "nas", "never", "gone"}, {"methods", "tomorrow"}};

        for (String [] eachArray : words){

            for(String eachWord : eachArray){
                System.out.print(eachWord.charAt(eachWord.length() - 1));
            }
            System.out.println();
        }
    }

}
