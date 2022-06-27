package day33_methods;

public class GetCharacters {

    public static void charUpperCase(){
      for(char i = 'A'; i <= 'Z'; i++){
          System.out.print(i + " ");
      }
        System.out.println();
    }
    public static void charLowerCase(){
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void charUpperCaseBack(){
        for(char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void charLowerCaseBack() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        public static void numbers () {
            for (int i = 0; i <= 20; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    public static void main(String[] args) {
        charUpperCase();
        charLowerCase();
        charUpperCaseBack();
        charLowerCaseBack();
        numbers();
    }

}
