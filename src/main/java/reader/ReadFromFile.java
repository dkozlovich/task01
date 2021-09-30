package reader;

import entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import parser.CustomArrayParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    private static final Logger logger = LogManager.getLogger();

    public CustomArray read(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            CustomArray customArray;
            while ((line = reader.readLine()) != null) {
                customArray = CustomArrayParser.parse(line);
                if (customArray != null) {
                    logger.log(Level.INFO,"Valid array found!");
                    return customArray;
                }
            }
        }
        logger.log(Level.ERROR,"No valid arrays found!");
        return null;
    }
}
