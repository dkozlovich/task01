package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.service.impl.CustomArrayOperationServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomArrayOperationServiceImplTest {

    private CustomArrayOperationService customArrayOperationService;

    @Before
    public void init() {
        customArrayOperationService = CustomArrayOperationServiceImpl.getInstance();
    }

    @Test
    public void testFindMinStream() {
        int expected = 1;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findMinStream(customArray));
    }

    @Test
    public void testFindMin() {
        int expected = 1;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findMin(customArray));
    }

    @Test
    public void testFindMaxStream() {
        int expected = 5;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findMaxStream(customArray));
    }

    @Test
    public void testFindMax() {
        int expected = 5;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findMax(customArray));
    }

    @Test
    public void testFindAverageStream() {
        int expected = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findAverageStream(customArray));
    }

    @Test
    public void testFindAverage() {
        int expected = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findAverage(customArray));
    }

    @Test
    public void testFindSumStream() {
        int expected = 15;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findSumStream(customArray));
    }

    @Test
    public void testFindSum() {
        int expected = 15;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(expected, customArrayOperationService.findSum(customArray));
    }

    @Test
    public void testFindNumberOfPositiveStream() {
        int expected = 2;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(expected, customArrayOperationService.findNumberOfPositiveStream(customArray));
    }

    @Test
    public void testFindNumberOfPositive() {
        int expected = 2;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(expected, customArrayOperationService.findNumberOfPositive(customArray));
    }

    @Test
    public void testFindNumberOfNegativeStream() {
        int expected = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(expected, customArrayOperationService.findNumberOfNegativeStream(customArray));
    }

    @Test
    public void testFindNumberOfNegative() {
        int expected = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(expected, customArrayOperationService.findNumberOfNegative(customArray));
    }

    @Test
    public void testReplaceAllNegativeStream() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray expected = new CustomArray(new int[]{1, 2, 3, 4, 5});
        CustomArray result = customArrayOperationService.replaceAllNegativeStream(source);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testReplaceAllNegative() {
        CustomArray source = new CustomArray(new int[]{1, 2, 3, -4, -5});
        CustomArray expected = new CustomArray(new int[]{1, 2, 3, 4, 5});
        CustomArray result = customArrayOperationService.replaceAllNegative(source);
        Assert.assertEquals(expected, result);
    }
}
