package day54_abstraction.animal;

import day54_abstraction.language.Language;

public class Zoo {
    public static void main(String[] args) {



        Animal dog = new Dog();
        Animal animal = new Parrot();
        Language language = new Parrot();


        language.hi();
        language.bye();
        dog.eat();
        animal.eat();


    }
}
