package com.epam.task01.service;

import com.epam.task01.validator.Validator;
import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {

    @Test
    public void testValidate() {
        boolean result = Validator.validate("1 2 3 4 5");
        Assert.assertTrue(result);
    }

    @Test
    public void testValidate2() {
        boolean result = Validator.validate("1 2 3 4z 5");
        Assert.assertFalse(result);
    }

    @Test
    public void testValidate3() {
        boolean result = Validator.validate("");
        Assert.assertFalse(result);
    }
}
