package service;

import entity.CustomArray;
import org.junit.Assert;
import org.junit.Test;

public class CustomArrayOperationServiceTest {

    @Test
    public void testGetMin() {
        int exp = 1;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp,CustomArrayOperationService.getMin(customArray));
    }

    @Test
    public void testGetMax() {
        int exp = 5;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp,CustomArrayOperationService.getMax(customArray));
    }

    @Test
    public void testGetAverage() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp,CustomArrayOperationService.getAverage(customArray));
    }

    @Test
    public void testGetSum() {
        int exp = 15;
        CustomArray customArray = new CustomArray(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(exp,CustomArrayOperationService.getSum(customArray));
    }

    @Test
    public void testGetNumberOfPositive() {
        int exp = 2;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp,CustomArrayOperationService.getNumberOfPositive(customArray));
    }

    @Test
    public void testGetNumberOfNegative() {
        int exp = 3;
        CustomArray customArray = new CustomArray(new int[]{1, 2, -3, -4, -5});
        Assert.assertEquals(exp,CustomArrayOperationService.getNumberOfNegative(customArray));
    }

}
