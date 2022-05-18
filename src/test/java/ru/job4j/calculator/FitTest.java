package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 185;
        double expected = 97.74;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womenWeight() {
        short in = 185;
        double expected = 86.25;
        double out = Fit.womenWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}