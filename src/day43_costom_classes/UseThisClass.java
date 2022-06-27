package day43_costom_classes;

public class UseThisClass {
    public static void main(String[] args) {
        
        ThisKeyword obj = new ThisKeyword(300);
        System.out.println(obj.a);  // 777 --> using 'this.a = 777' from 'ThisKeyword'
    }
}
