package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert120RubleThenDollar() {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        float aps = 0.0001f;
        Assert.assertEquals(expected, out, aps);
    }
}