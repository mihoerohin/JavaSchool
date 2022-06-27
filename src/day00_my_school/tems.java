package day00_my_school;

import java.util.Scanner;

public class tems {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps
        // from saim: please update to use a loop to have a different sized arrays

        double sum = 0;

        for(int i = 0; i < temps.length-1; i++) {
        sum += temps[i];

        }
        System.out.println(sum / (temps.length));
    }
}
