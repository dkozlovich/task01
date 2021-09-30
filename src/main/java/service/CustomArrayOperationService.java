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

    public static void bubbleSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public static void insertionSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
    }

    public static void selectionSort(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }

}
