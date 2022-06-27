package day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,51,1,22,0,3,6,4,7,3,4,5,2,4,5));

//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i) < 5){
//                list.remove(i);
//            }
//        }
//        System.out.println(list);   [51, 22, 3, 6, 7, 4, 5, 4, 5]

//        for (int each : list) {
//            if (list.get(each)<5){
//                list.remove(each);
//            }
//          }
//         System.out.println(list);    ConcurrentModificationException


        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){

            if(it.next() <= 5){
                it.remove();
            }
        }
        System.out.println(list);
    }
}
