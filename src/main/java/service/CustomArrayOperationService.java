package service;

import entity.CustomArray;

public class CustomArrayOperationService {

    public static int getMin(CustomArray customArray) {
        int min = customArray.getCustomArray()[0];
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] < min) {
                min = customArray.getCustomArray()[i];
            }
        }
        return min;
    }

    public static int getMax(CustomArray customArray) {
        int max = customArray.getCustomArray()[0];
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] > max) {
                max = customArray.getCustomArray()[i];
            }
        }
        return max;
    }

    public static int getAverage(CustomArray customArray) {
        return getSum(customArray) / customArray.getCustomArray().length;
    }

    public static int getSum(CustomArray customArray) {
        int sum = 0;
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            sum = sum + customArray.getCustomArray()[i];
        }
        return sum;
    }

    public static int getNumberOfPositive(CustomArray customArray) {
        int number = 0;
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] > 0) {
                number++;
            }
        }
        return number;
    }

    public static int getNumberOfNegative(CustomArray customArray) {
        int number = 0;
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] < 0) {
                number++;
            }
        }
        return number;
    }

    public static void replaceAllNegative(CustomArray customArray) {
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] < 0) {
                int temp = customArray.getCustomArray()[i];
                customArray.getCustomArray()[i] = Math.abs(temp);
            }
        }
    }

}
