package com.edthrash.JavaWebTest.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilTest {
    @Test
    public  void RepeatStringOnce() {
        Assert.assertEquals("Hola ", StringUtil.repeat("Hola", 1));
    }

    @Test
    public  void RepeatStringMultipleTimes() {
        Assert.assertEquals("Hola Hola ",StringUtil.repeat("Hola", 2));
    }

    @Test
    public  void RepeatStringZeroTimes() {
        Assert.assertEquals("",StringUtil.repeat("", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public  void RepeatStringNegativeTimes() {
        Assert.assertEquals("",StringUtil.repeat("", -1));
    }
}