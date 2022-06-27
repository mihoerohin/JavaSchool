package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        System.out.println("enter a URL");
        Scanner input = new Scanner(System.in);
        String url = input.next();

        boolean valueStart = url.startsWith("www.");
        boolean valueEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith(".net");


        if(valueStart && valueEnd){
            System.out.println(url + " is valid website");
        }else{

            if(!valueStart) {
                System.out.println("URL need to start with www.");

            }if (!valueEnd){
                System.out.println("URL need to end with .com or .edu or .gov or .net");

            }
        }
    }
}
