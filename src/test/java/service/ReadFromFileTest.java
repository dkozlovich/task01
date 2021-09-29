package service;

import org.junit.Assert;
import org.junit.Test;
import reader.ReadFromFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFromFileTest {
    @Test
    public void testRead() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("toReadFrom.txt").getFile());
        List<Integer> result = new ReadFromFile().read(file);
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        Assert.assertEquals(expected,result);
    }
}
