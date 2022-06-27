package day35_methods;

public class ContainArray {

    public static boolean contains(int [] nums, int element){

        for (int each : nums){
            if(each == element){
                return true;
            }
        }

        return false;
    }
}
