package entity;

import java.util.Arrays;

public class CustomArray {
    private int[] CustomArray;

    public CustomArray(int[] array) {
        this.CustomArray = array;
    }

    public int[] getCustomArray() {
        return CustomArray;
    }

    public void setCustomArray(int[] customArray) {
        CustomArray = customArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomArray that = (CustomArray) o;

        return Arrays.equals(CustomArray, that.CustomArray);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(CustomArray);
    }
}
