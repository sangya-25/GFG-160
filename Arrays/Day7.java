public class Day7 {
    public static void main(String[] args) {
        int[] prices = {1, 5, 3, 8, 4, 9}; // Example input

        Solution sol = new Solution();
        int profit = sol.maximumProfit(prices);

        System.out.println("Maximum profit: " + profit);
    }
}

// User function Template for Java
class Solution {
    public int maximumProfit(int prices[]) {
        int n = prices.length;
        int maxProfit = 0; 
        int Min = prices[0];
        int Max = prices[0];
        int i = 0;

        while (i < n - 1) {
            // Find local minima
            while (i < n - 1 && prices[i] >= prices[i + 1]) {
                i++;
            }
            if (i == n - 1) break;
            Min = prices[i];

            // Find local maxima
            while (i < n - 1 && prices[i] <= prices[i + 1]) {
                i++;
            }
            Max = prices[i];

            maxProfit += (Max - Min);
        }

        return maxProfit;
    }
}
