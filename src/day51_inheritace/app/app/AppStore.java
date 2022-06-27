package day51_inheritace.app.app;

public class AppStore {
    public static void main(String[] args) {

        Instagram obj1 = new Instagram(3.2);
        obj1.download();
        obj1.postPicture();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

        YouTube obj2 = new YouTube(1.4);
        obj2.download();
        obj2.watchVideo();
        
    }
}
