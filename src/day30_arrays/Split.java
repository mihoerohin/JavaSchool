package day30_arrays;

import java.util.Arrays;
import java.util.Locale;

public class Split {
    public static void main(String[] args) {
        System.out.println();

        String s = "monday,friday,saturday,sunday";
        String[] days = s.split(",");
        System.out.println(Arrays.toString(days));

        System.out.println();

        for(String day : days){
            System.out.println(day);
        }
        System.out.println();
        String [] withOutDay  = s.split("day");

        for(String each : withOutDay){
            System.out.println(each);
        }

        System.out.println();

        String str = "Jan-feb-mar-Apr-may-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String [] months = str.split("-");

        for(String each : months){
            System.out.println(each.toUpperCase());
        }

    }
}
