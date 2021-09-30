package service;

import entity.CustomArray;
import exception.CustomArrayException;
import org.junit.Assert;
import org.junit.Test;
import reader.ReadFromFile;

import java.io.File;
import java.io.IOException;

public class ReadFromFileTest {
    @Test
    public void testRead() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        CustomArray result = new ReadFromFile().read(file);
        CustomArray expected = new CustomArray(new int[]{7,8,9});
        Assert.assertEquals(expected,result);
    }
}
