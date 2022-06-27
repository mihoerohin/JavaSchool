package day36_methods;

import java.util.Arrays;

public class AddElement {

    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = addElement(a, 4);
        System.out.println(Arrays.toString(b));

        int[] y = {12,434,54,65};
        int[] x = {43,12,54,33};
        System.out.println(Arrays.toString(addElement(y,x)));
    }

    public static int [] addElement(int [] original, int elementToAdd){
        int [] newArray = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];
        }
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public static String [] addElement(String [] original, String element){

        return null;
    }

    public static int [] addElement(int [] original, int [] elementsToAdd){
        int [] newArray = new int[original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArray.length; i++) {

            if (i < original.length) {

                newArray[i] = original[i];
            } else {
                newArray[i] = elementsToAdd[j++];
            }
        }

        return newArray;
    }
}
