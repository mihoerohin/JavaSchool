package day19_string;

public class SubStringMethod {
    public static void main(String[] args) {

        String str = "Sunday";
        //            012345

        System.out.println("1 " + str.substring(1));
        System.out.println("3 " + str.substring(3));
        System.out.println("5 " + str.substring(5));
        System.out.println("6 " + str.substring(6));
        System.out.println("Satur" + str.substring(3));

        System.out.println(str.substring(2, 4));
        
        System.out.println(str.substring(0, 6));
        System.out.println(str.substring(3, 6));




    }


}
