package com.epam.task01.service.impl;

import com.epam.task01.entity.CustomArray;
import com.epam.task01.service.CustomArrayOperationService;

import java.util.stream.IntStream;

public class CustomArrayOperationServiceImpl implements CustomArrayOperationService {
    private CustomArrayOperationServiceImpl() {

    }

    private static CustomArrayOperationService instance;

    public static CustomArrayOperationService getInstance() {
        if (instance == null) {
            instance = new CustomArrayOperationServiceImpl();
        }
        return instance;
    }

    @Override
    public int findMinStream(CustomArray customArray) {
        int min = IntStream.of(customArray.getCustomArray()).min().getAsInt();
        return min;
    }

    @Override
    public int findMin(CustomArray customArray) {
        int min = customArray.getCustomArray()[0];
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] < min) {
                min = customArray.getCustomArray()[i];
            }
        }
        return min;
    }

    @Override
    public int findMaxStream(CustomArray customArray) {
        int max = IntStream.of(customArray.getCustomArray()).max().getAsInt();
        return max;
    }

    @Override
    public int findMax(CustomArray customArray) {
        int max = customArray.getCustomArray()[0];
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] > max) {
                max = customArray.getCustomArray()[i];
            }
        }
        return max;
    }

    @Override
    public int findAverageStream(CustomArray customArray) {
        int average = (int) IntStream.of(customArray.getCustomArray()).average().getAsDouble();
        return average;
    }

    @Override
    public int findAverage(CustomArray customArray) {
        return findSum(customArray) / customArray.getCustomArray().length;
    }

    @Override
    public int findSumStream(CustomArray customArray) {
        int sum = IntStream.of(customArray.getCustomArray()).sum();
        return sum;
    }

    @Override
    public int findSum(CustomArray customArray) {
        int sum = 0;
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            sum = sum + customArray.getCustomArray()[i];
        }
        return sum;
    }

    @Override
    public int findNumberOfPositiveStream(CustomArray customArray) {
        int number = (int) IntStream.of(customArray.getCustomArray()).filter(x -> x > 0).count();
        return number;
    }

    @Override
    public int findNumberOfPositive(CustomArray customArray) {
        int number = 0;
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] > 0) {
                number++;
            }
        }
        return number;
    }

    @Override
    public int findNumberOfNegativeStream(CustomArray customArray) {
        int number = (int) IntStream.of(customArray.getCustomArray()).filter(x -> x < 0).count();
        return number;
    }

    @Override
    public int findNumberOfNegative(CustomArray customArray) {
        int number = 0;
        for (int i = 0; i < customArray.getCustomArray().length; i++) {
            if (customArray.getCustomArray()[i] < 0) {
                number++;
            }
        }
        return number;
    }

    @Override
    public CustomArray replaceAllNegativeStream(CustomArray customArray) {
        int[] array = customArray.getCustomArray();
        int[] copyArray = IntStream.of(array).map(i -> i < 0 ? Math.abs(i) : i).toArray();
        return new CustomArray(copyArray);
    }

    @Override
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

}
