package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax1To2Then1() {
        int left = 2;
        int right = 1;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax1To2ThenEqual() {
        int left = 3;
        int right = 3;
        int expected = 3;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}