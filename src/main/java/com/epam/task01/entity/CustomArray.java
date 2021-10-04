package com.epam.task01.entity;

import java.util.Arrays;

public class CustomArray {
    private final int[] customArray;

    public CustomArray(int[] array) {
        this.customArray = array;
    }

    public int[] getCustomArray() {
        int[] arrayCopy = customArray.clone();
        return arrayCopy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        return Arrays.equals(customArray, that.customArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(customArray);
    }
}
