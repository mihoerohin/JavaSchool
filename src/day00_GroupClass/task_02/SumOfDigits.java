package day00_GroupClass.task_02;

public class SumOfDigits {
    public static void main(String[] args) {
//      String - sum of digits in a string
//   Write a method that can return the sum of the digits in a string

        System.out.println(SumOfDigits("5.99public 1static 1void 1main1(5String[]1 4args)1{"));
           //total 20                        5          1       1     1    1 5        1 4     1
    }
    public static String SumOfDigits(String word) {

     int sumOfDigits = 0;

        for (int i = 0; i < word.length(); i++) {

            if (Character.isDigit(word.charAt(i))) {    // Character.isDigit ==> looking for only digits

                int n = Integer.parseInt("" + word.charAt(i)); // Integer.parseInt() ==> convert from string to integer
                sumOfDigits += n; //    sum all digits
            }
        }
        return "" + sumOfDigits;  //  return digit in a string
    }
}
