package day47_encapsulation;

public class DebitCard {

    long cardNumber;
    String holderName;
    String cardType;
    int pin;
    double balance;

    static String accountType;

    static {
        accountType = "Checking...";
    }

    public DebitCard(long cardNumber,String holderName,double balance){

        this.holderName=holderName;
        this.balance=balance;

        if (String.valueOf(cardNumber).length() == 16){
            this.cardNumber = cardNumber;
        }  else {
            System.out.println("Invalid card number");
        }
    }

    public DebitCard(long cardNumber, String holderName, String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance);

        if (cardType.equalsIgnoreCase("visa") || cardType.equalsIgnoreCase("mastercard")){
            this.cardType = cardType;
        } else {
            System.out.println("Invalid card type - Must be Visa or Mastercard");
        }

        if (String.valueOf(pin).length() == 4){
            this.pin = pin;
        }   else {
            System.out.println("Invalid pin - must be 4 digits");
        }
    }

    public String toString(){

        String info = "Holder name: " + holderName;
        if (cardNumber != 0){
            info += "\nCard number: " + cardNumber;
        }
        if(cardType != null){
            info += ", Card type: " + cardType;
        }
        info += "\nBalance: " + balance;

        return info;
    }
}
