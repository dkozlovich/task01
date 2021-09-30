package validation;

import entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

public class Validator {

    static Logger LOGGER;

    public static CustomArray validate(String str) {
        String[] s = str.split(",\\s|\\s-\\s|\\s");
        int[] intArray = new int[s.length];
        try {
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = Integer.parseInt(s[i]);
            }
        } catch (NumberFormatException e) {
            LOGGER.log(Level.ERROR,"The string is not valid.");
            return null;
        }
        return new CustomArray(intArray);
    }
}
