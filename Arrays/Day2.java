import java.util.Arrays;

public class Day2{
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        Solution sol = new Solution();
        sol.pushZerosToEnd(arr);

        System.out.println("Array after pushing zeros to end: " + Arrays.toString(arr));
    }
}

// GFG-style user function
class Solution {
    void pushZerosToEnd(int[] arr) {
        int nonzeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[nonzeroIndex];
                arr[nonzeroIndex] = temp;
                nonzeroIndex++;
            }
        }
    }
}
