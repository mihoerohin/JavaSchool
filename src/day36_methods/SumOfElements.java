package day36_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {2,5,2,6,};
        System.out.println(sum(arr));

        System.out.println(sum(2,6,9));
    }
    public static int sum(int ... nums){        // "..." ---> element array
        int sum = 0;
        for (int each : nums){
            sum += each;

        }
        return sum;
    }
}
