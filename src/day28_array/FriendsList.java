package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.println("how many friends do you want to store?");
        int size = input.nextInt();
        String [] friendsList = new String[size];

        for(int i = 0; i < friendsList.length; i++){
            System.out.println("Enter the name of friend " + (i + 1) );
            friendsList[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(friendsList));





    }
}
