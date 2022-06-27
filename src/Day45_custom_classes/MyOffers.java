package Day45_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Offer first = new Offer("Google", "Texas", 200_000, true, 15);
        System.out.println(first);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(first);
        System.out.println(allOffers);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        allOffers.add(new Offer("Amazon", "New York", 180_000, true, 15));
        System.out.println(allOffers);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Offer [] moreOffers = {
                new Offer("Apple","Chicago", 230_000, false, 10),
                new Offer("Tesla","Texas", 250_000, true, 20),
                new Offer("FaceBook","Florida",120_000,true,10)
        };

        allOffers.addAll(Arrays.asList(moreOffers));
        System.out.println(allOffers);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        allOffers.addAll(Arrays.asList(
                new Offer("Discord","Chicago",150_000, false,13),
                new Offer("Netflix", "Canada", 145_000, true, 12),
                new Offer("Sony","Japan", 330_000, true, 10)
        ));
        System.out.println(allOffers);
        System.out.println();

      System.out.println("~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
              // create ArrayList to filter the Offer
        ArrayList<Offer> salaries = new ArrayList<>(allOffers);
        salaries.removeIf(each -> each.salary < 170_000);
        System.out.println("            Salaries above 170,000");
        System.out.println(salaries);
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~ArrayList~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        ArrayList<Offer> fullTime = new ArrayList<>(allOffers);
        fullTime.removeIf(each -> !each.isFullTime);            // !each.isFullTime == false
        System.out.println("            Only fullTime offers");
        System.out.println(fullTime);
        System.out.println();
    }

}
