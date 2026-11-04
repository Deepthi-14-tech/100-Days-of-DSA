
// Day 1 - Problem 5
// LeetCode #1672 - Richest Customer Wealth
// Concepts: 2D Arrays, Nested Loops, Maximum Sum
// Time Complexity: O(m * n)
// Auxiliary Space Complexity: O(1)

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        // Traverse each customer
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;

            // Calculate the customer's total wealth
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            // Update the maximum wealth
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
