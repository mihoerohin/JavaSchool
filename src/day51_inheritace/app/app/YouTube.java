package day51_inheritace.app.app;

public class YouTube  extends App{

    public YouTube(double version){
        super("Youtube", version);
    }
    public void watchVideo(){
        System.out.println("Watching video online in YouTube");
    }
}
