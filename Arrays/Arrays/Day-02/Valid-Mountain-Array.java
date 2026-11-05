class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        // Move upward
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be the first or last element
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Move downward
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
