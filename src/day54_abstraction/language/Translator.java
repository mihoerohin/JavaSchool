package day54_abstraction.language;

public class Translator {
    public static void main(String[] args) {

        Spanish spanish = new Spanish();
        spanish.hi();
        spanish.bye();

        System.out.println();

        Turkish turkish = new Turkish();
        turkish.hi();
        turkish.bye();

        System.out.println();

        System.out.println(Language.PLANET);

    }
}
