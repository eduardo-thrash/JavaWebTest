package com.edthrash.JavaWebTest.util;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {

    public static void main(String[] args) {

        String result = StringUtil.repeat("Hola", 3);
        assetEqueals(result, "Hola Hola Hola " );

        assetEqueals(StringUtil.repeat("Hola", 2),"Hola Hola ");

    }

    private static void assetEqueals(String actual, String expected) {

        if(!actual.equals(expected))
            throw new RuntimeException("Actual is not equal to expected...\nActual: "+actual + "\nExpect: " + expected);
    }

}