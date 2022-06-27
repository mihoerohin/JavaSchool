package day47_encapsulation;

public class UseLogin {
    public static void main(String[] args) {

        Login obj = new Login();

        //  obj.username = "miho";
        //  obj.password = "666";

        obj.setUsername("miho");
        obj.setPassword("666");// too short password == null

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword());  // too short password == null

        obj.setPassword("66613666");
        System.out.println(obj.getPassword());

    }
}
