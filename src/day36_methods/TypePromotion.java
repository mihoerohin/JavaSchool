package day36_methods;

public class TypePromotion {

    public static void main(String[] args) {
        use(3);
        use(3.5);
        use(3l);
        use(3f);
        use(2321.323);

        use((double) 3);
    }


    public static void use(float f){
        System.out.println("calling float method");
    }

    public static void use(double d){
        System.out.println("calling double method");
    }

    public static void use(long l){
        System.out.println("calling long method");
    }
}
