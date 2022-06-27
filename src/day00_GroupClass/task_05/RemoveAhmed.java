package day00_GroupClass.task_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class RemoveAhmed {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Saim", "Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

        String str = "Ahmed, John, Eric, Ahmed,Saim, Ahmed";
        String[] arr = str.split(",");

        List<String> names2 = new ArrayList<>(Arrays.asList(arr));
        names2.removeIf(n -> n.contains("Ahmed"));

        System.out.println(String.join(" ", names2).trim());
    }
}
