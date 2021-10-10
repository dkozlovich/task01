package com.epam.task01.validator;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Validator {

    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER_REGEX = ",\\s|\\s-\\s|\\s";
    private static final String MATCHER_REGEX = "\\d+";

    public static boolean isValid(String str) {
        boolean isValid;
        String[] numbers = str.split(DELIMITER_REGEX);
        for (int i = 0; i < numbers.length; i++) {
            isValid = numbers[i].matches(MATCHER_REGEX);
            if (!isValid) {
                logger.log(Level.ERROR, "The string is not valid. " + Arrays.toString(numbers));
                return false;
            }
        }
        logger.log(Level.INFO, "The string is valid. " + Arrays.toString(numbers));
        return true;
    }
}
