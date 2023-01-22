package day00_map_my_school;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mike","Emre","Janna","Kate","Victor","Kamilios"));

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()){
            String currentName = iterator.next();
            if (currentName.length()<6 || currentName.startsWith("M")){
                iterator.remove();
            }
        }

        System.out.println(names);


        List<String> names2 = new ArrayList<>();
        names.addAll(Arrays.asList("Mike","Emre","Janna","Kate","Victor","Kamilios"));

        names2.removeIf(each->(each.length()<6 || each.startsWith("M")));




        String str = "aaaaabbcddfaabbammll";
        String result = "";

        String[] split = str.split("");
        // OR
        List<String> list = Arrays.asList(str.split(""));


        for (String each : new LinkedHashSet<>(list) ) {
            int freq = Collections.frequency(list,each);
            if(!result.contains(each))
                result+=each+freq;
        }
        System.out.println(result);
    }
}
