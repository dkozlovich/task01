package com.epam.task01.reader.impl;

import com.epam.task01.exception.CustomArrayException;
import com.epam.task01.reader.Reader;
import com.epam.task01.validator.Validator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderImpl implements Reader<File> {

    private static final Logger logger = LogManager.getLogger();

    public String read(File file) throws CustomArrayException {
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            boolean isCorrect;
            while ((line = reader.readLine()) != null) {
                isCorrect = Validator.validate(line);
                if (isCorrect) {
                    return line;
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