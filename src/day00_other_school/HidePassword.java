package day00_other_school;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {


        ArrayList<String> w = new ArrayList<>();
        w.add("miho");
        w.add("lol");
        w.add("longWord");

        for (int i = 0; i < w.size(); i++) {
            String password = "";
            int word = w.get(i).length();
            
            for (int j = 0; j < word; j++) {
                password += "*";

            }
             w.set(i, password);
        }


        System.out.println(w);
    }
}
