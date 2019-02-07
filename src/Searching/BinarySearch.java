package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        System.out.println("The index of number is: " + binarySearch.search(array,1));
    }
    public int search(int[] array, int number){
        int leftPointer = 0;
        int rightPointer = array.length - 1;
        return binarySearch(array, leftPointer, rightPointer, number);
    }

    private int binarySearch(int[] arr, int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if(arr[l] == x){
                return l;
            }
            if(arr[r] == x){
                return r;
            }
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        // when number is not in an array
        return -1;
    }

}
