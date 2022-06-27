package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayHello();
    //String msg = sayHello(); ----> doesn't work
        sayBay();
        System.out.println(sayBay());
        String msg = sayBay();
        System.out.println(msg);

        
    }


    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBay(){
        return "Bye";
    }

}
