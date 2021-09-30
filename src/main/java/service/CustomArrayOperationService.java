package service;

import entity.CustomArray;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CustomArrayOperationService {

    public static int getMin(CustomArray customArray) {
        int min;
        min = IntStream.of(customArray.getCustomArray()).min().getAsInt();
        return min;
    }

    public static int getMax(CustomArray customArray) {
        int max;
        max = IntStream.of(customArray.getCustomArray()).max().getAsInt();
        return max;
    }

    public static int getAverage(CustomArray customArray) {
        return (int) IntStream.of(customArray.getCustomArray()).average().getAsDouble();
    }

    public static int getSum(CustomArray customArray) {
        int sum;
        sum = IntStream.of(customArray.getCustomArray()).sum();
        return sum;
    }

    public static int getNumberOfPositive(CustomArray customArray) {
        int number = 0;
        number = (int) IntStream.of(customArray.getCustomArray()).filter(x -> x > 0).count();
        return number;
    }

    public static int getNumberOfNegative(CustomArray customArray) {
        int number = 0;
        number = (int) IntStream.of(customArray.getCustomArray()).filter(x -> x < 0).count();
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
