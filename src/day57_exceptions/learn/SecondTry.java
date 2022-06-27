package day57_exceptions.learn;

public class SecondTry {
    public static void main(String[] args) {

        try{

            String s = "LOL";
            System.out.println(s.length());

            int [] a = {1,4,5,6};
            System.out.println(a[2]);


        }catch (NullPointerException e){
            System.out.println("Caught a null pointer exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array Index Out Of Bounds Exception");
        }
        System.out.println("Done");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        try{

            String s = null;
            System.out.println(s.length());

            int [] a = {1,4,5,6};
            System.out.println(a[9]);


        }catch (NullPointerException e){
            System.out.println("Caught a null pointer exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Caught the Array Index Out Of Bounds Exception");
        }
        System.out.println("Done");
    }
}
