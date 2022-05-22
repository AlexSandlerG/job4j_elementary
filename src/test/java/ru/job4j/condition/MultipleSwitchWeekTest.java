package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {

    @Test
    public void whenNameMondayThenDay1() {
        String name = "Monday";
        int expected = 1;
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenNameOverThenDayMinus1() {
        String name = "Over";
        int expected = -1;
        int out = MultipleSwitchWeek.numberOfDay(name);
        Assert.assertEquals(expected, out);
    }
}