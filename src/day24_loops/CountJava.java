package day24_loops;

public class CountJava {
    public static void main(String[] args) {


        /*
           java is a language
           01234
        ||              ||
        \/next 4 letters\/
           java  0, 4       i, i + 4
           ava   1, 5       i, i + 4
           va i  2, 6       i, i + 4
          */

        String str = "java is a java language.java";
        int count = 0;

        for(int i = 0; i < str.length() - 3; i++) {

            String everyFour = str.substring(i, i + 4);
            
            System.out.println(everyFour);
            if (everyFour.equals("java")) {
                count++;
            }
        }
        
        System.out.println(count);

        System.out.println();


        for(int even = 1; even <= 20; even++){

            if(even % 2 == 0){
                System.out.print(even + " ");
                even++;
            }
        }


        System.out.println();

        for(int odd = 1; odd <= 20; odd++){

            if(odd % 2 != 0){
                System.out.print(odd + " ");
                odd++;
            }
        }

    }
}
