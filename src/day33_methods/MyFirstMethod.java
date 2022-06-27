package day33_methods;

public class MyFirstMethod {

    public static void helloWorld(){

        System.out.println("Hello world");

    }

    public static void helloWorld50(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hello world");
        }
    }

    public static void main(String[] args) {
        helloWorld();
        System.out.println("    1");
        helloWorld();
        System.out.println("    50");
        helloWorld50();
        System.out.println("    50");
        helloWorld50();
    }



}
