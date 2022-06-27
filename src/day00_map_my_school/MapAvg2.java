package day00_map_my_school;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MapAvg2 {
    public static void main(String[] args) {

        Map<String, Double> map = new TreeMap<>();
        map.put("Data Scientist", 97_200.00);
        map.put("Nurse Practitioner", 96_285.00);
        map.put("Electrician", 47_800.00);
        map.put("Accountant", 56_930.00);
        map.put("Pharmacist", 112_800.00);
        map.put("Firefighter", 48_532.00);
        map.put("Pharmacy Technician", 35_800.00);
        map.put("Medical Assistant", 34_672.00);
        map.put("Certified Nursing Assistant", 29_286.00);
        map.put("Software Engineer", 89_200.00);

        System.out.println(map);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        String nameLargest = "";
        double maxSalary = 0.0;

        String nameLowest = "";
        double minSalary = Double.MAX_VALUE;

        for (String key : map.keySet()) {
            double value = map.get(key);

            if (value > maxSalary){
                nameLargest = key;
                maxSalary = value;
            }
            if (value < minSalary){
                nameLowest = key;
                minSalary = value;
            }
        }
        System.out.println("Max salary ==> " + nameLargest + " $" + maxSalary);
        System.out.println("Min salary ==> " + nameLowest + " $" + minSalary);


        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<String> prof = new ArrayList<>(map.keySet());
        System.out.println(prof);

        ArrayList<Double> salary = new ArrayList<>(map.values());
        System.out.println(salary);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        double max = 0;

        for (int i = 0; i < salary.size(); i++) {
            if (max < salary.get(i)) {
                max = salary.get(i);
            }
        }

        double min = salary.get(0);

        for (int j = 1; j < salary.size(); j++) {
            if (min > salary.get(j)) {
                min = salary.get(j);
            }
        }


        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        double sum = 0;
        for (int i = 0; i < salary.size(); i++) {
            sum += salary.get(i);
        }
        double average = sum / salary.size();
        System.out.println("average = " + average);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i) >= 40000 && salary.get(i) <= 90000) {
                System.out.println(prof.get(i) + " $"+ salary.get(i));
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        for (int i = 0; i < salary.size(); i++) {
            if (salary.get(i)<= 40000){
                System.out.println("employees who are making less than $40000 ===>  " + prof.get(i) + " $" + salary.get(i));
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        Map<String, Double> growsUp = new TreeMap<>();
        for (int i = 0; i < salary.size(); i++) {
            growsUp.put(prof.get(i), salary.get(i)+10000);

        }
        System.out.println("Before\n" + map);
        System.out.println("After + $10000\n" + growsUp);


    }
}
