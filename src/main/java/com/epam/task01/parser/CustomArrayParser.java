package com.epam.task01.parser;

import com.epam.task01.entity.CustomArray;

public class CustomArrayParser {

    private static final String DELIMITER_REGEX = ",\\s|\\s-\\s|\\s";

    public static CustomArray parse(String str) {
        String[] numbers = str.split(DELIMITER_REGEX);
        int[] intArray = new int[numbers.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(numbers[i]);
        }
        CustomArray customArray = new CustomArray(intArray);
        return customArray;
    }
}