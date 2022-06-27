package day19_string;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s = "pen";
        System.out.println(s.indexOf("p"));  // 0
        System.out.println(s.indexOf("e"));  // 1
        System.out.println(s.indexOf("n"));  // 2

        System.out.println(s.indexOf("x"));    // -1
        System.out.println(s.indexOf("pen"));  // 0
        System.out.println(s.indexOf("pe"));   // 0
        System.out.println(s.indexOf("pn"));   // -1

        String str = "apple";
        System.out.println(str.indexOf("e"));  // 4 






    }
}
