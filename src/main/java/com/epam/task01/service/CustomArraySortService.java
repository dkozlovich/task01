package com.epam.task01.service;

import com.epam.task01.entity.CustomArray;

public interface CustomArraySortService {
    CustomArray bubbleSort(CustomArray customArray);

    CustomArray insertionSort(CustomArray customArray);

    CustomArray selectionSort(CustomArray customArray);
}
