package entity;

import java.util.Arrays;

public class CustomArray {
    private int[] customArray;

    public CustomArray(int[] array) {
        this.customArray = array;
    }

    public int[] getCustomArray() {
        return customArray;
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
