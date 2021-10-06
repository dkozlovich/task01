package com.epam.task01.validator;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Optional;

public class Validator {

    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER_REGEX = ",\\s|\\s-\\s|\\s";
    private static final String MATCHER_REGEX = "\\d+";

    public static String validate(String str) throws CustomArrayException {
        String[] numbers = str.split(DELIMITER_REGEX);
        for (int i = 0; i < numbers.length; i++) {
            boolean valid = numbers[i].matches(MATCHER_REGEX);
            if (!valid) {
                logger.log(Level.ERROR, "The string is not valid. " + Arrays.toString(numbers));
                throw new CustomArrayException("The string contains not valid symbols!");
            }
        }
        if (numbers.length > 0) {
            logger.log(Level.INFO, "Valid string found! " + Arrays.toString(numbers));
        }
    }
}
