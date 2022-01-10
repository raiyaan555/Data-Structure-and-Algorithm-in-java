
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastUnsortIn = intArray.length - 1; lastUnsortIn >= 0; lastUnsortIn--) {
            for (int i = 0; i < lastUnsortIn; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i+1);
                }
            }
        }


        for (int i = 0; i < intArray.length; i++) {
           System.out.print(intArray[i]+" ");
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