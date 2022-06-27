package day58_exception.bank;

public class UseAccounts {
    public static void main(String[] args) {

        Bank accountOne = new Bank();
        accountOne.balance = 1000;
        accountOne.withdraw(500);
        System.out.println(accountOne.balance);

        accountOne.withdraw(22);
        System.out.println(accountOne.balance);


        //////////////////////LOGIN////////////////////////////
        try {
            accountOne.login("jamesbond", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        //////////////////INVALID USERNAME/////////////////////
        try {
            accountOne.login("james", "007");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

        //////////////////INVALID PASSWORD/////////////////////

        try {
            accountOne.login("jamesbond", "111");
        }catch (InvalidCredentialsException e){
            System.out.println(e.getMessage());
        }

    }
}
