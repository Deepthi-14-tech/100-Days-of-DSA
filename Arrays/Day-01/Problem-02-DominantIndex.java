
// Day 1 - Problem 2
// LeetCode #747 - Largest Number At Least Twice of Others
// Concepts: Arrays, Maximum Element, Index Tracking
// Time Complexity: O(n)
// Auxiliary Space Complexity: O(1)

class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int maxIndex = 0;

        // Find the largest element and its index
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        // Check whether maximum is twice every other element
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && max < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}

