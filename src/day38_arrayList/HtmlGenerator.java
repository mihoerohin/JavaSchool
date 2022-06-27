package day38_arrayList;

public class HtmlGenerator {
    public static void main(String[] args) {
        System.out.println(htmlGenerate("miho^4"));
    }

    // li^3  --> repeat last number
    //output --> <li></li><li></li><li></li>

    public static String htmlGenerate(String str){

        String html = "";
        String [] parts = str.split("\\^");  // or str.replace("^", " ").split(" ");

        int repeat = Integer.parseInt(parts[1]);

        for (int i = 0; i < repeat; i++) {
               html += "<" + parts[0] + "></" + parts[0] + ">";

        }
        return html;

    }
}
