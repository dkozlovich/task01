package parser;

import entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomArrayParser {

    private static final Logger logger = LogManager.getLogger();
    private static final String REGEX = ",\\s|\\s-\\s|\\s";

    public static CustomArray parse(String str) {
        String[] s = str.split(REGEX);
        int[] intArray = new int[s.length];
        try {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(s[i]);
            }
        } catch (NumberFormatException e) {
            logger.log(Level.ERROR,"The string is not valid.");
            return null;
        }
        if (intArray.length > 1) {
            logger.log(Level.INFO, "Valid string found!");
            return new CustomArray(intArray);
        } else return null;
    }
}
