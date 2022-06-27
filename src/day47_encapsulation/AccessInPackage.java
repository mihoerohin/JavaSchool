package day47_encapsulation;

public class AccessInPackage {

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        
        System.out.println(obj.a);
        System.out.println(obj.b);
      //  System.out.println(obj.c);        private outside the class

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
      //  System.out.println(AccessModifier.z);   private outside the class

    }

}
