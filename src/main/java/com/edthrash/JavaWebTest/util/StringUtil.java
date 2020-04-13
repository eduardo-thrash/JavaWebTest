package com.edthrash.JavaWebTest.util;

public class StringUtil {

    public static String repeat(String str, int times) {

        if(times < 0)
            throw new IllegalArgumentException("Negative times not allowed");

        String result = "";

        for (int i = 0; i < times; i++) {
            result = result + str + " ";
        }

        return result;
    }
}
