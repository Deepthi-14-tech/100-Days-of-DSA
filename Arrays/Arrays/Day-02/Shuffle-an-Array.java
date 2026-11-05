import java.util.Random;

class Solution {

    private int[] original;
    private Random random;

    public Solution(int[] nums) {
        original = nums.clone();
        random = new Random();
    }

    public int[] reset() {
        return original.clone();
    }

    public int[] shuffle() {
        int[] result = original.clone();

        for (int i = result.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            int temp = result[i];
            result[i] = result[j];
            result[j] = temp;
        }

        return result;
    }
}
