package day58_exception.bank;

public class InvalidCredentialsException extends Exception{

    public InvalidCredentialsException(String msg){

        super(msg);
    }
}
