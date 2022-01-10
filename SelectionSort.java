

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsort = intArray.length -1; lastUnsort > 0; lastUnsort--) {
            int largest = 0;

            for (int i = 0; i <= lastUnsort; i++) { // = is important
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsort);
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}