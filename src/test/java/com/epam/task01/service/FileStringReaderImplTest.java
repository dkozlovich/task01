package com.epam.task01.service;

import com.epam.task01.exception.CustomArrayException;
import com.epam.task01.reader.StringReader;
import com.epam.task01.reader.impl.FileStringReaderImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class FileStringReaderImplTest {

    private StringReader<File> stringReader;

    @Before
    public void init() {
        stringReader = FileStringReaderImpl.getInstance();
    }

    @Test
    public void testRead() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        String expected = "7 - 8 - 9";
        String result = stringReader.read(file);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = CustomArrayException.class)
    public void testCustomArrayException() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AllIncorrectStrings.txt").getFile());
        stringReader.read(file);
    }
}