import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 1, 1};  // You can try with other arrays too

        Solution sol = new Solution();
        List<Integer> majorityElements = sol.findMajority(nums);

        System.out.println("Majority elements (appearing more than n/3 times): " + majorityElements);
    }
}

// User function Template for Java
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        int num1 = 0, num2 = 0, count1 = 0, count2 = 0, n = nums.length;

        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
            else if (count1 == 0) {
                num1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                num2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Verify actual counts
        count1 = count2 = 0;
        for (int num : nums) {
            if (num == num1) count1++;
            else if (num == num2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        if (count1 > n / 3) result.add(num1);
        if (count2 > n / 3 && num2 != num1) result.add(num2);

        Collections.sort(result);
        return result;
    }
}
