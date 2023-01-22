package day29_Arrays;

public class AverageNumber {
    public static void main(String[] args) {

          int [] nums = {15, 11, 8, 4, 2};

          int sum = 0;

          for(int i = 0; i < nums.length; i++){
              sum += nums[i];
          }
        System.out.println("Average: " + (sum / nums.length));

        System.out.println();

        for(int each : nums){
            sum += each;
        }
        System.out.println("Average 2: " + (sum / nums.length));

    }
}
