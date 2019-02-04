package Sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] ints = {5, 1, 6, 8, 2, 6, 8, 44, 112, 64, 3, 64, 12, 85,
                24, 88, 2, 4, 1};
        sort(ints);
        for (int i : ints) {
            System.out.print(i + " ");
        }

    }

    public static void sort(int[] ints) {
        int n = ints.length;

        for (int i = 0; i < n - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (ints[j] < ints[min_index]) {
                    min_index = j;
                }
                int temp = ints[min_index];
                ints[min_index] = ints[i];
                ints[i] = temp;
            }
        }

    }
}
