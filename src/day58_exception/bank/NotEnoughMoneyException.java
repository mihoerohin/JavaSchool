package day58_exception.bank;

public class NotEnoughMoneyException extends RuntimeException{

    public NotEnoughMoneyException(){
        super("Not enough money in the account");
    }
}
