package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {

    public static ArrayList<String> removeCountries(ArrayList<String> countries){
        countries.removeIf(country->country.length() >= 7);
        return countries;
    }

    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan","Kazakhstan", "Canada","United Kingdom"));
        System.out.println(countries);
        System.out.println(removeCountries(countries));
    }
}
