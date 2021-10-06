package com.epam.task01.service;

import com.epam.task01.exception.CustomArrayException;
import com.epam.task01.reader.Reader;
import com.epam.task01.reader.impl.FileReaderImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class FileReaderImplTest {

    private Reader<File> reader;

    @Before
    public void init() {
        reader = FileReaderImpl.getInstance();
    }

    @Test
    public void testRead() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        String expected = "7 - 8 - 9";
        String result = reader.read(file);
        Assert.assertEquals(expected, result);
    }

    @Test(expected = CustomArrayException.class)
    public void testCustomArrayException() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AllIncorrectStrings.txt").getFile());
        reader.read(file);
    }
}