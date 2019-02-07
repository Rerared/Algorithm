package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {21, 41, 5, 23, 1, 5, 6, 7, 5, 32};
        sort(ints);
    }

    public static void sort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
