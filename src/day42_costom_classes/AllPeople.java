package day42_costom_classes;

public class AllPeople {
    public static void main(String[] args) {

        Person personOne = new Person();
        Person personTwo = new Person();



        System.out.println("name: " + personOne.name + ", age: " + personOne.age);
        System.out.println();
        
        personOne.height = 6.3;
        personOne.isMarried = true;

        System.out.println("height: " + personOne.height);
        System.out.println("Is married? " + personOne.isMarried);

        System.out.println();
        System.out.println(personTwo.isMarried);
        System.out.println(personTwo.height);
        System.out.println(personTwo.name);
        System.out.println(personTwo.age);


    }
}
