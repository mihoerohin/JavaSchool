package day57_exceptions.webelement;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {

        Form obj = new Form();
        Link obj2 = new Link();
        Input obj3 = new Input();

        ArrayList<WebElement> elements = new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(new Image());
        elements.add(new Form());

        for (WebElement each : elements) {
            System.out.println(each.getText());

            if(each instanceof Form){
                ((Form)each).submit();
            }
        }

        System.out.println();

        WebElement logo = new Image();
        logo.click();

        ((Image)logo).extension = ".png";
    }
}
