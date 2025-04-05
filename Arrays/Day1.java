import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        // Sample input
        int[] arr = {12, 35, 1, 10, 34, 1};

        // Create object of Solution and call the function
        Solution sol = new Solution();
        int result = sol.getSecondLargest(arr);

        // Output the result
        System.out.println("Second largest element: " + result);
    }
}

// Your GFG solution pasted below
class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return -1;
        }
        Arrays.sort(arr);
        int largest = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i];
            }
        }
        return -1;
    }
}
