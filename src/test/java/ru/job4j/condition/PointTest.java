package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when34to20then412() {
        double expected = 4.12;
        Point a = new Point(3, 4);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when51to28then761() {
        double expected = 7.61;
        Point a = new Point(5, 1);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when39to72then806() {
        double expected = 8.06;
        Point a = new Point(3, 9);
        Point b = new Point(7, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}