package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenStart0Finish5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenStart1Finish8Then36() {
        int start = 1;
        int finish = 8;
        int expected = 36;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenStart1Finish1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }
}