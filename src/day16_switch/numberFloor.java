package day16_switch;

import java.util.Scanner;

public class numberFloor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to.
        // After getting to each floor show the information of which companies are on that floor. Use the following data:
        //
        //	floor 1 --> Lobby, StarBucks, Amazon Pick Up
        //	floor 2 --> NASA, Cydeo, Discover
        //	floor 3 --> Uber, Lyft, Chase
        //	floor 4 --> Rooftop, Lounge
        //
        //	any other floor value --> Invalid Floor Selected

        System.out.println("which floor you want the elevator to go to?");
        int floor = input.nextInt();
        String info = "";

        switch (floor) {
            case 1:
                info = "Floor " + floor + "\nLobby\nStarBuck\nAmazon Pick Up";
                break;
            case 2:
                info = "Floor " + floor + "\nNASA\nCydeo\nDiscovery";
                break;
            case 3:
                info = "Floor " + floor + "\nUber\nLyft\nChase";
                break;
            case 4:
                info = "Floor " + floor + "\nRooftop\nLounge";
                break;
            default:
                info = "Invalid Floor Selected";
                break;
        }


        System.out.println(info);




    }
}
