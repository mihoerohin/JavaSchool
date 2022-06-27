package day34_methods;

public class CreditScore {
    public static void main(String[] args) {

        System.out.println("my credit score: " + getCreditScore());
        System.out.println();
        System.out.println("my credit score with 50 bonus: ");
        System.out.println(getCreditScore() + 50);
        System.out.println(isGoodCreditScore(680));
        System.out.println(isGoodCreditScore(720));
        System.out.println(isGoodCreditScore(getCreditScore()));

        System.out.println(isGoodCreditScore(500) ? "Good score" : "Bad score");

    }
    public static int getCreditScore(){

        return 800;
    }
    public static boolean isGoodCreditScore(int creditScore){
        if(creditScore >= 700){
            return true;
        }else{
            return false;
        }
    }
}
