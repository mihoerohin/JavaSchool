package day0000;

public class ReversRRR {

 public boolean poli(String str){

     String newStr = "";

     for (int i = str.length()-1; i >=0 ; i--) {
         newStr += str.charAt(i);
     }
     if(str.equals(newStr)){
         return true;
     }
     return false;
 }

    public static void main(String[] args) {

    }

}
