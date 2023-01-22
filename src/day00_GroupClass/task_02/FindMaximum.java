package day00_GroupClass.task_02;

public class FindMaximum {
    public static void main(String[] args) {
//    Array - Find Maximum
//  Write a method that can find the maximum number from an int Array

        int[] nums = {3,5,787,123,2,-99,5,-83};

        int min = Integer.MIN_VALUE;
        for (int num : nums){
            if(min<num){
                min=num;
            }
        }
        System.out.println(min);

        int maxValue = Integer.MAX_VALUE;
        for (int num : nums){
            if(maxValue > num){
                maxValue =num;
            }
        }
        System.out.println(maxValue);

        String str = "Array - Find Maximum";
        System.out.println("Array - Find Maximum = " + reversAll(str));
    }

    public static String reversAll(String str){

        String revers = "";
        String[] arr = str.split(" ");

        for (String word : arr){

            for (int i = word.length()-1; i >= 0; i--) {
                revers += word.charAt(i);
            }
            revers += " ";
        }

        return revers.substring(0,1).toUpperCase() + revers.substring(1).toLowerCase();

    }



}
