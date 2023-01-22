package day29_Arrays;

import java.util.*;

public class Initials {
    public static void main(String[] args) {

        String[] names = {"James Bond", "Eve Rell", "Anna Johnson"};

        String[] splint = Arrays.copyOf(names, names.length*2);

        System.out.println(Arrays.toString(splint));

        List<Map<String, String>> list = new ArrayList<>();

        for(String each : names){

           String[] arr =  each.split(" ");

            Map<String, String> tempMap = new HashMap<>();

                tempMap.put("FirstName", arr[0]);
                tempMap.put("LastName", arr[1]);

                list.add(tempMap);
        }

        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println(list.get(1).get("FirstName"));
        System.out.println(list.get(0).get("LastName"));

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        for(Map e : list){
            System.out.println(e.values());
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        for (Map e : list){
            System.out.println("LastName " + e.get("LastName"));
        }
    }
}
