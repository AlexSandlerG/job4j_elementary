package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void whenDay4ThenNameThursday() {
        int day = 4;
        String expected = "Четверг";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenDay55ThanNameError() {
        int day = 55;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}