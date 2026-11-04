
// Day 1 - Problem 4
// LeetCode #1920 - Build Array from Permutation
// Concepts: Arrays, Indexing, Array Creation
// Time Complexity: O(n)
// Auxiliary Space Complexity: O(n)

class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        // Build the new array using the given formula
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
