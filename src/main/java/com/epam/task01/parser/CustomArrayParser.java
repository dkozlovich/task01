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
    private static final String REGEX = ",\\s|\\s-\\s|\\s";

    public static Optional<CustomArray> parse(String str) throws CustomArrayException {
        String[] s = str.split(REGEX);
        int[] intArray = new int[s.length];
        try {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(s[i]);
            }
        } catch (NumberFormatException e) {
            logger.log(Level.ERROR,"The string is not valid. " + Arrays.toString(s));
            throw new CustomArrayException("The string contains not valid symbols!");
        }
        if (intArray.length > 1) {
            logger.log(Level.INFO, "Valid string found! " + Arrays.toString(intArray));
            return Optional.of(new CustomArray(intArray));
        } else return Optional.empty();
    }
}
