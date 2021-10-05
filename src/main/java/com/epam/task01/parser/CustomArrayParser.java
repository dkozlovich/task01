package com.epam.task01.parser;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.exception.CustomArrayException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Optional;

public class CustomArrayParser {

    private static final Logger logger = LogManager.getLogger();
    private static final String DELIMITER_REGEX = ",\\s|\\s-\\s|\\s";

    public static Optional<CustomArray> parse(String str) throws CustomArrayException {
        String[] numbers = str.split(DELIMITER_REGEX);
        int[] intArray = new int[numbers.length];
        try {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(numbers[i]);
            }
        } catch (NumberFormatException e) {
            logger.log(Level.ERROR, "The string is not valid. " + Arrays.toString(numbers));
            throw new CustomArrayException("The string contains not valid symbols!");
        }
        Optional<CustomArray> customArray;
        if (intArray.length > 0) {
            logger.log(Level.INFO, "Valid string found! " + Arrays.toString(intArray));
            customArray = Optional.of(new CustomArray(intArray));
        } else {
            customArray = Optional.empty();
        }
        return customArray;
    }
}
