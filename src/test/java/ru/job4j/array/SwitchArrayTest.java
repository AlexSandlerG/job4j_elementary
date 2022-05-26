package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1to4() {
        int[] input = {2, 4, 5, 8, 9};
        int[] expected = {2, 9, 5, 8, 4};
        int[] result = SwitchArray.swap(input, 1, input.length - 1);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to0() {
        int[] input = {2, 4, 5, 8, 9};
        int[] expected = {8, 4, 5, 2, 9};
        int[] result = SwitchArray.swap(input, 3, 0);
        Assert.assertArrayEquals(expected, result);
    }
}