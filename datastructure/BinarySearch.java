package datastructure;

import java.util.Arrays;
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; 
            } else if (arr[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 8, 1, 13, 15};
        Arrays.sort(arr);
        System.out.println(binarySearch(arr, 10));
        System.out.println(binarySearch(arr, 9));  
    }
}
