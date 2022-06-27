package day32_arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {

        String [][] cydeo = new String[4][];        //   1st[] ==> numbers in array,   2nd[] ==> array
        System.out.println(Arrays.deepToString(cydeo));
        System.out.println();

        String [] groupOne = {"miho", "janna", "neka"};
        cydeo[0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 2");
        String [] groupTwo = {"ruslan", "vova", "Misha", "bond"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("adding group 3");
        cydeo[2] = new String[]{"KOBE", "shack"};       // syntax to create an array without a reference
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println("same group 3 as group 4");
        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo));

        System.out.println();

        for(String [] innerArray : cydeo){

            for(String eachWord : innerArray){
                System.out.println(eachWord);
            }
        }
        
    }
}
