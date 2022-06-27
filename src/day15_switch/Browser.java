package day15_switch;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your Browser:");
        String browser = input.next();
        System.out.println("Enter you URL:");
        String url = input.next();

        switch (browser){
            case "chrome":
            case "Chrome":
                System.out.println("Opening " + url + " in the Chrome browser");
                System.out.println("Loading...");
                break;
            case "Safari":
            case "safari":
                System.out.println("Opening " + url + " in the Safari browser");
                System.out.println("Loading...");
                break;
            case "Opera":
            case "opera":
                System.out.println("Opening " + url + " in the Opera browser");
                System.out.println("Loading...");
                break;
            default:
                System.out.println(browser + " is not valid browse");
        }
    }
}
