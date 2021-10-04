package com.epam.task01.service.impl;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.service.CustomArrayOperationService;

import java.util.stream.IntStream;

public class CustomArrayOperationServiceImpl implements CustomArrayOperationService {

    public int getMin(CustomArray customArray) {
        int min;
        min = IntStream.of(customArray.getCustomArray()).min().getAsInt();
        return min;
    }

    public int getMax(CustomArray customArray) {
        int max;
        max = IntStream.of(customArray.getCustomArray()).max().getAsInt();
        return max;
    }

    public int getAverage(CustomArray customArray) {
        return (int) IntStream.of(customArray.getCustomArray()).average().getAsDouble();
    }

    public int getSum(CustomArray customArray) {
        int sum;
        sum = IntStream.of(customArray.getCustomArray()).sum();
        return sum;
    }

    public int getNumberOfPositive(CustomArray customArray) {
        int number;
        number = (int) IntStream.of(customArray.getCustomArray()).filter(x -> x > 0).count();
        return number;
    }

    public int getNumberOfNegative(CustomArray customArray) {
        int number;
        number = (int) IntStream.of(customArray.getCustomArray()).filter(x -> x < 0).count();
        return number;
    }

    public CustomArray replaceAllNegative(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                int temp = array[i];
                array[i] = Math.abs(temp);
            }
        }
        return new CustomArray(array);
    }

    public CustomArray bubbleSort(CustomArray customArray) {
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
        return new CustomArray(array);
    }

    public CustomArray insertionSort(CustomArray customArray) {
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
        return new CustomArray(array);
    }

    public CustomArray selectionSort(CustomArray customArray) {
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
        return new CustomArray(array);
    }

}
