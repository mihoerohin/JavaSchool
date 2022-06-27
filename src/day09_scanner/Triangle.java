package day09_scanner;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Determine if the angles make a triangle, which means the angles add to 180.0
        //    and
        //    Determine if the angles make a circle, which means the angles add to 360.0

        System.out.println("Angle 1:");
        float angle1 = input.nextFloat();

        System.out.println("Angle 2:");
        float angle2 = input.nextFloat();

        System.out.println("Angle 3:");
        float angle3 = input.nextFloat();

        double sum = (angle1 + angle2 + angle3);


        System.out.println("Total angles: " + sum);

        boolean resultTriangle = sum == 180;
        boolean resultCircle = sum == 360;

        System.out.println("\nResult Triangle: " + resultTriangle);
        System.out.println("Result circle: " + resultCircle);



    }
}
