package day22_loopper;

public class Letter {
    public static void main(String[] args) {

        char lowercaseUp = 'a';

        while(lowercaseUp <= 'z'){
            System.out.print(lowercaseUp + " ");
            lowercaseUp++;
        }
        System.out.println();
        
        char uppercaseBack = 'Z';

        while(uppercaseBack >= 'A'){
            System.out.print(uppercaseBack + " ");
            uppercaseBack--;
        }



    }
}
