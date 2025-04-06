// Importing Scanner class for user input
import java.util.Scanner;

class Solution {
    public int maximumProfit(int prices[]) {
        int minCost = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minCost) {
                minCost = prices[i];
            }
            maxProfit = Math.max(maxProfit, prices[i] - minCost);
        }
        return maxProfit;
    }
}

public class Day8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] prices={7,10,2,3,4,1,9,6};
        // Create object of Solution and call the function
        Solution sol = new Solution();
        int profit = sol.maximumProfit(prices);

        // Output: maximum profit
        System.out.println("Maximum Profit: " + profit);

        sc.close();
    }
}
