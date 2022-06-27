package day46_static;

import day47_encapsulation.AccessModifier;

public class AccessOutsidePackage {

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();

        System.out.println(obj.a);
    //    System.out.println(obj.b);    private outside the package
      //  System.out.println(obj.c);           private outside the class

        System.out.println(AccessModifier.x);
    //   System.out.println(AccessModifier.y);      private outside the package
       // System.out.println(AccessModifier.z);          private outside the class

    }
}
