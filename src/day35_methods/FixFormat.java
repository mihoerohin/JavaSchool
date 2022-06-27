package day35_methods;

import java.util.Locale;

public class FixFormat {

    public static String fixFormat (String str){
        str = str.trim();
        return  str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase(Locale.ROOT);

    }
}
