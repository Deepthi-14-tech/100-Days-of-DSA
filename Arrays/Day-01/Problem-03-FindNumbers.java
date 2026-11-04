
// Day 1 - Problem 3
// LeetCode #1295 - Find Numbers with Even Number of Digits
// Concepts: Arrays, While Loop, Digit Counting, Modulo Operator
// Time Complexity: O(n * d)
// Auxiliary Space Complexity: O(1)

class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int count = 0;

            // Count the digits
            while (n > 0) {
                n = n / 10;
                count++;
            }

            // Check whether the digit count is even
            if (count % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}
