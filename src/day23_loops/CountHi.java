package day23_loops;

public class CountHi {
    public static void main(String[] args) {
        
        String str = "abcabcvbabcabt";
                  //  012345678910
        int count = 0;

        for(int index = 0; index < str.length() - 1; index++){

            if(str.charAt(index) == 'a' && str.charAt(index + 1) == 'b'){  
                count++;
            }
        }
        System.out.println(count);

    }

}
