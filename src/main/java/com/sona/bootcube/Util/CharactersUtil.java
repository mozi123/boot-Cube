package com.sona.bootcube.Util;

import java.util.regex.Pattern;

public class CharactersUtil {


    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static  boolean isNumericArray(String str){
        Pattern pattern = Pattern.compile("[0-9,]*");
        return pattern.matcher(str).matches();
    }
}
