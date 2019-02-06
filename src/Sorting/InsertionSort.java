package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {31, 56, 7, 4, 99, 2, 8, 1, 54, 89, 42, 99, 312};
        insertionSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
    public void sort(int[] ints) {
        int n = ints.length;
        for (int i = 1; i < n; ++i) {
            int flag = ints[i];
            int left = i - 1;
            while (left >= 0 && ints[left] > flag) {
                ints[left + 1] = ints[left];
                left = left - 1;
            }
            ints[left + 1] = flag;
        }
    }
}