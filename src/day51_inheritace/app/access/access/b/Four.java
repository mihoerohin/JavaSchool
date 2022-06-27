package day51_inheritace.app.access.access.b;

import day51_inheritace.app.access.access.a.First;

public class Four extends First{
     
    public static void main(String[] args) {

        First obj = new First();
        System.out.println(obj.one);
    //    System.out.println(obj.two);
    //    System.out.println(obj.three);
    //    System.out.println(obj.four);

        Four obj2 = new Four();
        System.out.println(obj2.one);
        System.out.println(obj2.two);
    }
}
