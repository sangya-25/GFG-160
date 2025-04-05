import java.util.Arrays;

public class Day5{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Try changing this to {3, 2, 1}, {1, 1, 5}, etc.

        Solution sol = new Solution();
        sol.nextPermutation(arr);

        System.out.println("Next permutation: " + Arrays.toString(arr));
    }
}

// User function Template for Java
class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find the pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot, reverse entire array
        if (pivot == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find successor
        for (int i = n - 1; i > pivot; i--) {
            if (arr[i] > arr[pivot]) {
                swap(arr, i, pivot);
                break;
            }
        }

        // Step 4: Reverse suffix
        reverse(arr, pivot + 1, n - 1);
    }

    static void swap(int[] arr, int i, int pivot) {
        int temp = arr[i];
        arr[i] = arr[pivot];
        arr[pivot] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}

