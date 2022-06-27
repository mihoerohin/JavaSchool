package day44_costom_classes;

public class UseSong {
    public static void main(String[] args) {

        Song song1 = new Song("Waka waka");
        System.out.println(song1);
        System.out.println();

        Song song2 = new Song("Seek and destroy", 12.15, "Trash metal", "Metallica");
        System.out.println(song2);
    }
}
