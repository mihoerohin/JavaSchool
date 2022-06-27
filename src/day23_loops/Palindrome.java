package day23_loops;

public class Palindrome {
    public static void main(String[] args) {

        String mom = "misha";
        for(int i = mom.length() - 1; i >=  0 ; i--){
            System.out.println(mom.charAt(i));
        }

        System.out.println("<><><><><><><><>");

        String str = "miho";
        String revers = "";

        for(int n = str.length() - 1; n >=  0 ; n--) {
            revers += str.charAt(n);
        }
        System.out.println(revers);

    }

}
