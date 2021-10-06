package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.service.impl.CustomArraySortServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomArraySortServiceTest {

    private CustomArraySortService customArraySortService;

    @Before
    public void init() {
        customArraySortService = CustomArraySortServiceImpl.getInstance();
    }
    @Test
    public void testBubbleSort() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray expected = new CustomArray(new int[]{-5, -4, 1, 2, 3});
        CustomArray result = customArraySortService.bubbleSort(source);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testInsertionSort() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray expected = new CustomArray(new int[]{-5, -4, 1, 2, 3});
        CustomArray result = customArraySortService.insertionSort(source);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testSelectionSort() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray expected = new CustomArray(new int[]{-5, -4, 1, 2, 3});
        CustomArray result = customArraySortService.selectionSort(source);
        Assert.assertEquals(expected, result);
    }
}
