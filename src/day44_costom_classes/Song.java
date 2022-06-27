package day44_costom_classes;

public class Song {

    String name;
    double length;
    String artist;
    String genre;

    public Song(String name) {
        this.name = name;
    }

    public Song(String name, double length){
        this(name);
        this.length = length;
    }
    public Song(String name, double length, String genre) {
        this(name, length);
        this.genre = genre;
    }
    public Song(String name, double length, String genre, String artist) {
        this(name, length, genre);
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
