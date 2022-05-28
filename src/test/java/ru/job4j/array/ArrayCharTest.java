package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {

    @Test
    public void startsWith1() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'E'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(result);
    }

    @Test
    public void startsWith3() {
        char[] word = {'H', 'E', 'L', 'L', 'O'};
        char[] pref = {'H', 'T'};
        boolean result = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(result);
    }
}