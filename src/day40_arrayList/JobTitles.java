package day40_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {
    public static void main(String[] args) {


        ArrayList<String> allJobs = new ArrayList<>();
        allJobs.addAll(Arrays.asList("lol", "SDET", "PO", "PM", "BA", "QA", "Police officer"));
        System.out.println(allJobs);

        ArrayList<String> job1 = new ArrayList<>(allJobs);
        job1.removeAll(Arrays.asList("PO", "BA", "PM", "QA"));
        System.out.println(job1);


        System.out.println("_---____---__--_-___-----_----___------_---_---_-__---_-_--_--_-_");
        ArrayList<String> job2 = new ArrayList<>(allJobs);
        job2.retainAll(Arrays.asList("SDET", "Police officer"));
        System.out.println(job2);

        ArrayList<String> job3 = new ArrayList<>(allJobs);
        System.out.println(job3.containsAll(Arrays.asList("lol", "BA")));           // true
        System.out.println(job3.containsAll(Arrays.asList("President", "God")));    // false


    }
}
