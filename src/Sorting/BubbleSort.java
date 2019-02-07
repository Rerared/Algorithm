package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {33, 7, 65, 1, 98, 54, 74, 13, 2, 75, 3, 8, 4, 775, 26, 16};
        bubbleSort.sort(array);
        System.out.println(Arrays.toString(array));

    }

    public void sort(int[] ints){
        int n = ints.length;
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - i - 1 ; j++) {
                if(ints[j] > ints[j + 1]){
                    int temp = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = temp;
                }
            }
        }
    }
}
