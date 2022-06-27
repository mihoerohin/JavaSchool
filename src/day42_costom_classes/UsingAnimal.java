package day42_costom_classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal bird = new Animal();
        bird.population = 10000000;
        bird.species = "bird";

        System.out.println(bird);
    }
}
