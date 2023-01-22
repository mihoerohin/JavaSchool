package day58_exception;

import java.util.ArrayList;
import java.util.Locale;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Bay");

        try{
            System.out.println(list.get(1));
            String s = null;
            s.toLowerCase();

        }catch (IndexOutOfBoundsException e){
            System.out.println("====>Index Out Of Bounds catch block");
            System.out.println(e.getMessage());
        }catch (NullPointerException e){
            System.out.println("---> Null Pointer Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(list);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        try{
            Thread.sleep(-3000);
        }catch (InterruptedException | IllegalArgumentException e){
            System.out.println("Wrong number");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("last line for sleep try");
        }

    }
}
