class Solution {
    public boolean circularArrayLoop(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {

            int slow = i;
            int fast = i;

            boolean direction = nums[i] > 0;

            while (true) {

                slow = nextIndex(nums, slow, direction);

                if (slow == -1) {
                    break;
                }

                fast = nextIndex(nums, fast, direction);

                if (fast == -1) {
                    break;
                }

                fast = nextIndex(nums, fast, direction);

                if (fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true;
                }
            }
        }

        return false;
    }

    private int nextIndex(int[] nums, int index, boolean direction) {

        if ((nums[index] > 0) != direction) {
            return -1;
        }

        int n = nums.length;

        int next = ((index + nums[index]) % n + n) % n;

        if (next == index) {
            return -1;
        }

        return next;
    }
}
