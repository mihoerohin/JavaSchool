package day18_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today it is above 70";
        System.out.println(day.contains("it is"));      // true
        System.out.println(day.contains("0"));      // true
        System.out.println(day.contains(" "));      // true
        System.out.println(day.contains("o"));      // true
        System.out.println(day.contains("day"));      // true
        System.out.println(day.contains("it 70"));      // false
        System.out.println(day.contains("Today 70"));      // false


        System.out.println(day.indexOf("70"));
        


        if(day.contains("T") && day.contains("70") && day.contains("ve")){     // true
            System.out.println("yes");
        }



        if (day.contains("Today") && day.contains("Today")) {
            System.out.println("True");

        }
    }
}
