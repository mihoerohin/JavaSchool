package day30_arrays;

import java.util.Locale;

public class CharDay {
    public static void main(String[] args) {

        char [] day = {'m', 'o', 'n', 'd', 'a', 'y'};

        System.out.println(day);

        System.out.println(day.length);

        String strDay = new String(day);
        System.out.println(strDay);

        System.out.println(day[3] + "" + (day[4]) + "" + day[5]);
        System.out.println(strDay.toUpperCase());
    }
}
