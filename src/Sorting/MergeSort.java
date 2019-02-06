package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] array = {55, 22, 44, 55, 66, 1, 5, 3, 8, 21, 66, 95};
        System.out.println(Arrays.toString(ms.mergeSort(array)));
    }

    public int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int midpoint = array.length / 2;
        int[] left = new int[midpoint];
        int[] rigth;

        if (array.length % 2 == 0) {
            rigth = new int[midpoint];
        } else {
            rigth = new int[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = array[i];
        }
        for (int j = 0; j < rigth.length; j++) {
            rigth[j] = array[midpoint + j];
        }

        int[] result = new int[array.length];

        left = mergeSort(left);
        rigth = mergeSort(rigth);

        result = merge(left, rigth);
        return result;
    }

    private int[] merge(int[] left, int[] rigth) {

        int[] result = new int[left.length + rigth.length];

        int leftPointer, rigthPointer, resultPointer;
        leftPointer = rigthPointer = resultPointer = 0;

        while (leftPointer < left.length || rigthPointer < rigth.length) {

            if (leftPointer < left.length && rigthPointer < rigth.length) {

                if (left[leftPointer] < rigth[rigthPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = rigth[rigthPointer++];
                }

            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rigthPointer < rigth.length) {
                result[resultPointer++] = rigth[rigthPointer++];
            }

        }
        return result;

    }

}
