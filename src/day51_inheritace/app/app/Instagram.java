package day51_inheritace.app.app;

public class Instagram extends App{

    public Instagram(double version){
        super("Instagram", version);

    }
    public void  postPicture(){
        System.out.println("posting picture to Instagram");
    }
}
