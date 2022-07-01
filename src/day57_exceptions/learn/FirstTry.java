package day57_exceptions.learn;

public class FirstTry {
    public static void main(String[] args) {

        String word = "java";

        try{

            System.out.println("First line");
            System.out.println(word.charAt(11));
            System.out.println("First line2");

        }catch (Exception e){
            System.out.println("Exception happened");
        }finally {
            System.out.println("finally line");
        }

        System.out.println("Last line");


    }
}
