package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.exception.CustomArrayException;
import org.junit.Assert;
import org.junit.Test;
import com.epam.task01.reader.impl.FileReaderImpl;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class FileReaderImplTest {

    @Test
    public void testRead() throws IOException, CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        Optional<CustomArray> result = new com.epam.task01.reader.impl.FileReaderImpl().read(file);
        CustomArray expected = new CustomArray(new int[]{7,8,9});
        Assert.assertEquals(expected,result.get());
    }

    @Test(expected = CustomArrayException.class)
    public void testCustomArrayException() throws IOException, CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AllIncorrectStrings.txt").getFile());
        new com.epam.task01.reader.impl.FileReaderImpl().read(file);
    }
}