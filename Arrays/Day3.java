import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Solution sol = new Solution();
        sol.reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}

// GFG-style user function
class Solution {
    public void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

