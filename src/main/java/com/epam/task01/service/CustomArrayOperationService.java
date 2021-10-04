package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;

public interface CustomArrayOperationService {
    int getMin(CustomArray customArray);
    int getMax(CustomArray customArray);
    int getAverage(CustomArray customArray);
    int getSum(CustomArray customArray);
    int getNumberOfPositive(CustomArray customArray);
    int getNumberOfNegative(CustomArray customArray);
    CustomArray replaceAllNegative(CustomArray customArray);
    CustomArray bubbleSort(CustomArray customArray);
    CustomArray insertionSort(CustomArray customArray);
    CustomArray selectionSort(CustomArray customArray);
}
