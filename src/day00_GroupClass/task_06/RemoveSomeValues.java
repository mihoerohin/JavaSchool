package day00_GroupClass.task_06;

import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {

//    ArrayList - Remove some values
//    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     public static void main(String[] args) {

         List<Integer>list = new ArrayList<>();

         for (int i = 0; i <= 200; i+=5) { //// add numbers to ArrayList
             list.add(i);
         }
         System.out.print("list200 = " + list); //// print
         System.out.println();

         list.removeIf(n -> n > 100);   /////   remove all values greater than 100.
         System.out.print("list = " + list);

     }
}
