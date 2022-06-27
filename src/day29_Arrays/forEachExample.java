package day29_Arrays;

public class forEachExample {

    public static void main(String[] args) {

        int[] nums = {30, 12, 159, 12};

        for(int i = 0; i < nums.length; i++){
            System.out.println("Traditional " + nums[i]);
        }

        System.out.println();


        for(int element : nums){
            System.out.println("for each: " + element);
        }

        System.out.println();

        String [] classes = {"java", "soft skills", "selenium", "database", "api"};

        for(int i = 0; i < classes.length; i++){
            System.out.println(classes[i]);
        }
        System.out.println();


        for(String word : classes){
            System.out.println(word);
        }

        System.out.println();


        double [] prices = {10.25, 40.50, 410.25};

        for (double each : prices){
            System.out.println("$ " + each + "\n");
        }



    }
}
