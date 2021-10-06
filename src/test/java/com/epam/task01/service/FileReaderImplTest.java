package com.epam.task01.service;

import com.epam.task01.exception.CustomArrayException;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;

public class FileReaderImplTest {

    @Test
    public void testRead() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        String expected = "7 - 8 - 9";
        String result = new com.epam.task01.reader.impl.FileReaderImpl().read(file);
        Assert.assertEquals(expected,result);
    }

    @Test(expected = CustomArrayException.class)
    public void testCustomArrayException() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AllIncorrectStrings.txt").getFile());
        new com.epam.task01.reader.impl.FileReaderImpl().read(file);
    }
}