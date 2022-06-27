package day21_string;

public class ReplaceMethod {
    public static void main(String[] args) {

        String s = "java is a language";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "Today is monday. We will monday. Its monday";
        day = day.replace("monday", "tuesday");
        System.out.println(day);

        String str = "Today is monday. We will monday. Its monday";
        System.out.println(str.replace("monday", "tuesday"));

        String target =  "Today is monday. We will monday. Its monday";

        int firstIndex = target.indexOf('.');
        int secondIndex = target.lastIndexOf('.');
        String middleStr = target.substring(firstIndex, secondIndex);
        middleStr = middleStr.replace("monday", "weekday");

        System.out.println(target.substring(0, firstIndex) + middleStr + target.substring(secondIndex));



    }
}
