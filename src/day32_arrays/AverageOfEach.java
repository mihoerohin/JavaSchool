package day32_arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {

        int [][] num = {
                {3,4,5,6},
                {5,2,6},
                {10,20,39}
        };

        double total = 0;
        int totalLength = 0;

        for(int [] eachArray : num){

          //  System.out.println(Arrays.toString(eachArray));

            double sum = 0;

            for(int eachNumber : eachArray){
              //  System.out.println(eachNumber);

                sum += eachNumber;
            }
            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/ eachArray.length));
            total += sum;
            totalLength += eachArray.length;
        }
        System.out.println("Average of the whole 2d array: " + (total/totalLength ));
    }
}
