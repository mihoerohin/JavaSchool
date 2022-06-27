package day44_costom_classes;

public class ChainExample {

    public ChainExample(){
        System.out.println("First");    // print every time

    }
    public ChainExample(int i){
        this();
        System.out.println("Second");

    }
       public ChainExample(String s){
        this();
           System.out.println("Third");
       }

       public ChainExample(double d) {
           this(0);
           System.out.println("Fourth");
       }
}
