package day13_if_statement;

public class TernaryExamples {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd;

        if (a % 2 == 0){
            evenOrOdd = "Even 1";
        }else {
            evenOrOdd = "Odd 1";
        }
            String result = (a % 2 == 0) ? "Evan 2" : "Odd 2";

        System.out.println(evenOrOdd);
        System.out.println(result);

        int num = 4;
        String posOrNeg;

        if(num > 0){
            posOrNeg = "Positive 1";
        }else if(num < 0){
            posOrNeg = "Negative 1";
        }else{
            posOrNeg = "Zero 1";
        }
        System.out.println(posOrNeg);


        String sign = (num > 0) ? "positive 2" : (num < 0) ? "negative 2" : "zero 2";
        System.out.println(sign);
        
        int time = 12;
        double price;

        if (time >= 10 && time <= 15){
            price = 7.99;
        }else{
            price = 9.99;
        }
        System.out.println(price);

        double price1 = (time >= 10 && time <= 15) ? 8.99 : 13.99;

        


    }
}
