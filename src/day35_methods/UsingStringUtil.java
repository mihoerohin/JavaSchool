package day35_methods;

import my_utilities.StringUtil;

public class UsingStringUtil {
    public static void main(String[] args) {

        System.out.println(StringUtil.reverse("apple"));        // reverse word

        System.out.println(StringUtil.fixFormat("miHO"));      // fix word

        System.out.println(StringUtil.frequencyOfCharacter("aaadasdasdddasdrfvr", 'a'));   // count char

        System.out.println(StringUtil.uniqueCharacters("eat sleep rave repeat"));         // looking for unique char

        System.out.println();

        System.out.println();

        System.out.println(StringUtil.reverse("12345"));
    }
}
