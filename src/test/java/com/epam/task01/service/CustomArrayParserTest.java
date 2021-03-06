package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.exception.CustomArrayException;
import com.epam.task01.parser.CustomArrayParser;
import com.epam.task01.reader.StringReader;
import com.epam.task01.reader.impl.FileStringReaderImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class CustomArrayParserTest {

    private StringReader<File> stringReader;

    @Before
    public void init() {
        stringReader = FileStringReaderImpl.getInstance();
    }

    @Test
    public void testParse() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        CustomArray result = CustomArrayParser.parse(stringReader.read(file));
        CustomArray expected = new CustomArray(new int[]{7, 8, 9});
        Assert.assertEquals(expected,result);
    }

    @Test(expected = CustomArrayException.class)
    public void testParse2() throws CustomArrayException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("AllIncorrectStrings.txt").getFile());
        CustomArrayParser.parse(stringReader.read(file));
    }

    @Test
    public void testParse3() {
        CustomArray result = CustomArrayParser.parse("100 150 200");
        CustomArray expected = new CustomArray(new int[]{100, 150, 200});
        Assert.assertEquals(expected,result);
    }
}
