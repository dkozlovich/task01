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
        customArrayOperationService = new CustomArrayOperationServiceImpl();
    }

    @Test
    public void testGetMin() {
        int exp = 1;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.getMin(customArray));
    }

    @Test
    public void testGetMax() {
        int exp = 5;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.getMax(customArray));
    }

    @Test
    public void testGetAverage() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.getAverage(customArray));
    }

    @Test
    public void testGetSum() {
        int exp = 15;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp, customArrayOperationService.getSum(customArray));
    }

    @Test
    public void testGetNumberOfPositive() {
        int exp = 2;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp, customArrayOperationService.getNumberOfPositive(customArray));
    }

    @Test
    public void testGetNumberOfNegative() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp, customArrayOperationService.getNumberOfNegative(customArray));
    }

    @Test
    public void testReplaceAllNegative() {
        CustomArray source = new CustomArray(new int[]{1,2,3,-4,-5});
        CustomArray exp = new CustomArray(new int[]{1,2,3,4,5});
        CustomArray result = customArrayOperationService.replaceAllNegative(source);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void testBubbleSort() {
        CustomArray source = new CustomArray(new int[]{1,2,3,-4,-5});
        CustomArray exp = new CustomArray(new int[]{-5,-4,1,2,3});
        CustomArray result = customArrayOperationService.bubbleSort(source);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void testInsertionSort() {
        CustomArray source = new CustomArray(new int[]{1,2,3,-4,-5});
        CustomArray exp = new CustomArray(new int[]{-5,-4,1,2,3});
        CustomArray result = customArrayOperationService.insertionSort(source);
        Assert.assertEquals(exp, result);
    }

    @Test
    public void testSelectionSort() {
        CustomArray source = new CustomArray(new int[]{1,2,3,-4,-5});
        CustomArray exp = new CustomArray(new int[]{-5,-4,1,2,3});
        CustomArray result = customArrayOperationService.selectionSort(source);
        Assert.assertEquals(exp, result);
    }


}
