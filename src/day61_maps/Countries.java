package day61_maps;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        Map<String, ArrayList<String>> countries = new HashMap<>();

        countries.put("United States", new ArrayList<>(Arrays.asList("New york", "Boston", "Chicago", "Dallas", "LA", "Denver")));

        countries.put("Qazaqstan", new ArrayList<>(Arrays.asList("Astana", "Karaganda", "Almaty", "Shimkent")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Quebec", "Toronto", "Vancouver")));

        System.out.println(countries);

        for(ArrayList<String> cities : countries.values()){   // iterates through the alues of the map, which are the ArrayList of cities
            for (String eachCity : cities){
                if (eachCity.startsWith("D") || eachCity.startsWith("I")){
                    System.out.println(eachCity);
                }
            }
        }

        System.out.println();
        System.out.println("What country do you want to tour?");
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();

        for (String cities : countries.get(country)) {
            System.out.println("Touring... " + cities);
        }


    }
}
