package com.epam.task01.reader.impl;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.exception.CustomArrayException;
import com.epam.task01.parser.CustomArrayParser;
import com.epam.task01.reader.Reader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Optional;

public class FileReaderImpl implements Reader<File> {

    private static final Logger logger = LogManager.getLogger();

    public Optional<CustomArray> read(File file) throws CustomArrayException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            Optional<CustomArray> customArray = Optional.empty();
            while ((line = reader.readLine()) != null) {
                try {
                    customArray = CustomArrayParser.parse(line);
                } catch (CustomArrayException e) {
                    logger.log(Level.ERROR, "The array is not valid! ");
                }
                if (customArray.isPresent()) {
                    logger.log(Level.INFO, "Valid array found! " + customArray.get());
                    return customArray;
                }
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, e.getMessage());
            throw new CustomArrayException(e.getMessage());
        }
        logger.log(Level.ERROR, "No valid arrays found!");
        throw new CustomArrayException("No valid arrays found!");
    }
}
