package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.service.impl.CustomArrayOperationServiceImpl;
import com.epam.task01.service.impl.CustomArraySortServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayOperationServiceImplTest {

    private CustomArrayOperationService customArrayOperationService;

    private CustomArraySortService customArraySortService;

    @Before
    public void init() {
        customArrayOperationService = CustomArrayOperationServiceImpl.getInstance();
        customArraySortService = CustomArraySortServiceImpl.getInstance();
    }

    @Test
    public void testFindMinStream() {
        int exp = 1;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findMinStream(customArray));
    }

    @Test
    public void testFindMin() {
        int exp = 1;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findMin(customArray));
    }

    @Test
    public void testFindMaxStream() {
        int exp = 5;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findMaxStream(customArray));
    }

    @Test
    public void testFindMax() {
        int exp = 5;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findMax(customArray));
    }

    @Test
    public void testFindAverageStream() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findAverageStream(customArray));
    }

    @Test
    public void testFindAverage() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findAverage(customArray));
    }

    @Test
    public void testFindSumStream() {
        int exp = 15;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findSumStream(customArray));
    }

    @Test
    public void testFindSum() {
        int exp = 15;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.findSum(customArray));
    }

    @Test
    public void testFindNumberOfPositiveStream() {
        int exp = 2;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp, customArrayOperationService.findNumberOfPositiveStream(customArray));
    }

    @Test
    public void testFindNumberOfPositive() {
        int exp = 2;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp, customArrayOperationService.findNumberOfPositive(customArray));
    }

    @Test
    public void testFindNumberOfNegativeStream() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp, customArrayOperationService.findNumberOfNegativeStream(customArray));
    }

    @Test
    public void testFindNumberOfNegative() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp, customArrayOperationService.findNumberOfNegative(customArray));
    }

    @Test
    public void testReplaceAllNegative() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray exp = new CustomArray(new int[]{1, 2, 3, 4, 5});
        CustomArray result = customArrayOperationService.replaceAllNegative(source);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void testBubbleSort() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray exp = new CustomArray(new int[]{-5, -4, 1, 2, 3});
        CustomArray result = customArraySortService.bubbleSort(source);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void testInsertionSort() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray exp = new CustomArray(new int[]{-5, -4, 1, 2, 3});
        CustomArray result = customArraySortService.insertionSort(source);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void testSelectionSort() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray exp = new CustomArray(new int[]{-5, -4, 1, 2, 3});
        CustomArray result = customArraySortService.selectionSort(source);
        Assert.assertEquals(exp, result);
    }


}
