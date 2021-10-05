package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;

public interface CustomArrayOperationService {
    int findMinStream(CustomArray customArray);

    int findMin(CustomArray customArray);

    int findMaxStream(CustomArray customArray);

    int findMax(CustomArray customArray);

    int findAverageStream(CustomArray customArray);

    int findAverage(CustomArray customArray);

    int findSumStream(CustomArray customArray);

    int findSum(CustomArray customArray);

    int findNumberOfPositiveStream(CustomArray customArray);

    int findNumberOfPositive(CustomArray customArray);

    int findNumberOfNegativeStream(CustomArray customArray);

    int findNumberOfNegative(CustomArray customArray);

    CustomArray replaceAllNegative(CustomArray customArray);
}
