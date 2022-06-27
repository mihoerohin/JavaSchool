package day14_if_statements;

import java.util.Scanner;

public class Pandemic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year you want to check:");

        int year = input.nextInt();

        if (year >= 1346 && year <= 1353) {
            System.out.println("The black death");

        }else if (year >= 1665 && year <= 1666){
            System.out.println("Great plague of London");

        }else if(year >= 1770 && year <= 1772){
            System.out.println("Russian plague");

        }else if(year >= 1889 && year <= 1890) {
            System.out.println("Flu pandemic");

        }else if(year == 1916){
            System.out.println("American pandemic");

        }else if (year >= 1918 && year <= 1920){
            System.out.println("Spanish flue");

        }else if(year >= 2009 && year <= 2010){
            System.out.println("H1N1 Swine flu pandemic");

        }else if(year >= 2014 && year <= 2016){
            System.out.println("West African ebola epidemic");

        }else if(year >= 2020 && year <= 2022){

        }else{
            System.out.println("No pandemic");
        }
    }
}
