package day28_array;

public class AddElements {
    public static void main(String[] args) {

        int[] number = {3, 6, 10};

        System.out.println(number[0] + number[1] + number[2]);

        int sum = 0;
        for(int i = 0; i < number.length; i++){
           sum += number[i];
            
        }
        System.out.println(sum);
    }
}
