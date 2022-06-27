package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        // all possible reference/object of Lizard

        // itself
        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "Lizard";
        lizard.skinColor = "Camo";
        lizard.numberOfClaws = 4;
        System.out.println(lizard.name);
        System.out.println(lizard.skinColor);
        System.out.println(lizard.numberOfClaws);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");




        // super class - reptile
        Reptile reptile = new Lizard();
        reptile.eat();
        reptile.name = "Lizard";
        reptile.numberOfClaws = 4;
      //    reptile.skinColor = "Camo";   //reference does not nave access to skinColor variable
        System.out.println(reptile.name);
        System.out.println(reptile.numberOfClaws);
      //   System.out.println(reptile.skinColor);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        // super class - animal
        Animal animal = new Lizard();
        animal.eat();
        animal.name = "Lizard";
      //  animal.numberOfClaws = 4;  //reference does not nave access to numberOfClaws variable
     //   animal.skinColor = "Camo";//reference does not nave access to skinColor variable
        System.out.println(animal.name);
     //   System.out.println(animal.skinColor);
     //   System.out.println(animal.SkinOfClaws);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
