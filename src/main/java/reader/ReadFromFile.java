package reader;

import entity.CustomArray;
import exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import validation.Validator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    static Logger LOGGER;

    public CustomArray read(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            CustomArray customArray;
            while ((line = reader.readLine()) != null) {
                customArray = Validator.validate(line);
                if (customArray != null) {
                    return customArray;
                }
            }
        }
        LOGGER.log(Level.ERROR,"No valid arrays found!");
        return null;
    }
}
