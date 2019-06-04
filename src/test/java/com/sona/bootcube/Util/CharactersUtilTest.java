package com.sona.bootcube.Util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharactersUtilTest {

    @Test
    public void isNumeric() {

        Assert.assertTrue(CharactersUtil.isNumeric("45"));
        Assert.assertFalse(CharactersUtil.isNumeric("4 5"));
        Assert.assertFalse(CharactersUtil.isNumeric("8u"));
        Assert.assertFalse(CharactersUtil.isNumeric("zz"));
    }

    @Test
    public void isNumericArray() {

        Assert.assertTrue(CharactersUtil.isNumericArray("3,4"));
        Assert.assertFalse(CharactersUtil.isNumericArray("6, 4"));
        Assert.assertFalse(CharactersUtil.isNumericArray("3,f"));
        Assert.assertFalse(CharactersUtil.isNumericArray("p,f"));
    }
}