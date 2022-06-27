package day43_costom_classes;

public class ThisKeyword {

    int a = 100;

    public ThisKeyword(int a){
        a = 400;
        System.out.println(a);
        this.a = 777;
    }
}
