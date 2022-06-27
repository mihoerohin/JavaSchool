package day01_office_hours;

import java.util.*;

public class P01_ListPractice {
    public static void main(String[] args) {

        Integer[] nums = {1,2,3,4,5,4,3,2,123};


        System.out.println("----------ARRAY LIST----------");
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(nums));
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.size());

        System.out.println("----------LINKED LIST----------");
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(nums));
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(0));

        System.out.println("----------VECTOR LIST----------");
        Vector<Integer> integerVector = new Vector<>(Arrays.asList(nums));
        System.out.println(integerVector);
        System.out.println(integerVector.get(0));
        System.out.println(integerVector.size());
        integerVector.add(88);
        System.out.println(integerVector);


        System.out.println("----------STACK LIST----------");
        Stack<Integer> integerStack = new Stack<>();
        integerStack.addAll(Arrays.asList(nums));
        System.out.println(integerStack);
        System.out.println(integerStack.get(0));
        System.out.println(integerStack.size());
        System.out.println(integerStack.pop() + " " + integerStack.pop() + " == > " + integerStack);
        System.out.println(integerStack.search(1));
        System.out.println(integerStack.push(555));
        System.out.println(integerStack);
        System.out.println(integerStack.search(2));
        System.out.println(integerStack.add(555));  // true

        System.out.println(integerStack);  //[1, 2, 3, 4, 5, 4, 3, 555, 555]

        for (int i = 0; i < integerStack.size(); i++) {   //   555 555 3 4 5
            System.out.print(integerStack.pop()+" ");
        }
        System.out.println();
        System.out.println(integerStack); //  [1, 2, 3, 4]

        int size = integerStack.size();

        for (int i = 0; i < size; i++) {   //  4 3 2 1
            System.out.print(integerStack.pop() + " ");
        }



    }
}
