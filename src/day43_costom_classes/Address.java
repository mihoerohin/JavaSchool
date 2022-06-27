package day43_costom_classes;

public class Address {

    String street;
    String city;
    String state;
    String zipcode;

 //    public Address(String inputStreet, String inputCity, String inputState, String inputZipcode){
 //       street = inputStreet;
 //       city = inputCity;
 //       state = inputState;
 //       zipcode = inputZipcode;
 //
 //          <<   OR   >>     

    public Address (String street, String city, String state, String zipcode) {
        this.street = street;
        this.zipcode = zipcode;
        this.state = state;
        this.city = city;

    }

}
