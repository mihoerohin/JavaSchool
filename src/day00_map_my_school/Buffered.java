package day00_map_my_school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered {
    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine().trim();    // number1
        String c = bufferedReader.readLine().trim();    //  +  -  /  *
        String b = bufferedReader.readLine().trim();    // number2

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        switch (c){
            case "+":
                System.out.println(x + y);
                break;
            case "-":
                System.out.println(x - y);
                break;
            case "/":
                System.out.println(x / y);
                break;
            case "*":
                System.out.println(x * y);
                break;
            default:
                System.out.println("enter numbers");
        }


    }

}
