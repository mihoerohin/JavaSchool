package day35_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {

    public static String  uniqueCharacters(String str){

        String unique = "";
        String check = "";

        for(int i = 0; i < str.length(); i++){

            if(check.contains("" + str.charAt(i))){
                continue;
            }

            int count = StringUtil.frequencyOfCharacter(str, str.charAt(i));

            if(count == 1){
                unique += str.charAt(i);

            }
        }
                return unique;


    }
}
