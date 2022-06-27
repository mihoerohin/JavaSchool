package day33_methods;

public class OurArrayClass {
    public static void firstElement(int [] nums){
        System.out.println("First element: " + nums[0]);
    }
    public static void lastElement(int [] nums){
        System.out.println("Last element: " + nums[nums.length -1]);
    }
    public static void middleElement(int [] nums) {

        if (nums.length % 2 == 0) {

            System.out.println("First element: " + nums[nums.length / 2 - 1]);
            System.out.println("Second element: " + nums[nums.length / 2]);

        } else {
            System.out.println("Middle: " + nums[nums.length / 2]);
        }

    }
    public static void printArray(int[]nums){
        String result = "START | ";

        for(int num : nums){
            result += num + " - ";
        }
        result += " | END";
        System.out.println(result);
    }

    public static void main(String[] args) {

        int [] numbers = {4,54,23,67,65,5,99} ;


        firstElement(numbers);
        lastElement(numbers);
        middleElement(numbers);

        System.out.println();

        int [] numbers2 = {23,44,564,65,23,66};
        firstElement(numbers2);
        lastElement(numbers);
        middleElement(numbers2);

        printArray(numbers2);
        printArray(new int[] {40,30,22});
    }
}
