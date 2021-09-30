package reader;

import entity.CustomArray;
import exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parser.CustomArrayParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadFromFile {

    private static final Logger logger = LogManager.getLogger();

    public CustomArray read(File file) throws IOException, CustomArrayException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            CustomArray customArray = null;
            while ((line = reader.readLine()) != null) {
                try {
                    customArray = CustomArrayParser.parse(line);
                } catch (CustomArrayException e) {
                    e.printStackTrace();
                }
                if (customArray != null) {
                    logger.log(Level.INFO,"Valid array found! " + Arrays.toString(customArray.getCustomArray()));
                    return customArray;
                }
            }
        }
        logger.log(Level.ERROR,"No valid arrays found!");
        throw new CustomArrayException(new Throwable("No valid arrays found!"));
    }
}
