public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        int left = 1;
        int right = nums.length;
        int minLength = -1;

        // Binary search on the length of subarray
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (hasValidSubarray(nums, k, mid)) {
                minLength = mid;
                right = mid - 1; // Try to find smaller length
            } else {
                left = mid + 1; // Try larger length
            }
        }

        return minLength;
    }

    private boolean hasValidSubarray(int[] nums, int targetSum, int windowSize) {
        int arrayLength = nums.length;
        int[] bitCounts = new int[32]; // Tracks count of set bits at each position

        // Sliding window approach
        for (int right = 0; right < arrayLength; right++) {
            // Add current number to window
            updateBitCounts(bitCounts, nums[right], 1);

            // If window exceeds size
            if (right >= windowSize) {
                updateBitCounts(bitCounts, nums[right - windowSize], -1); // Remove leftmost number
            }

            // Check if current window is valid
            if (right >= windowSize - 1 && convertBitCountsToNumber(bitCounts) >= targetSum) {
                return true;
            }
        }
        return false;
    }

    // Updates bit count array when adding/removing a number from window
    private void updateBitCounts(int[] bitCounts, int number, int delta) {
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            // Check if bit is set in number
            if (((number >> bitPosition) & 1) != 0) { // If it is, we either add or remove it
                bitCounts[bitPosition] += delta;
            }
        }
    }

    // Converts bit count array back to number using bitwise sum
    private int convertBitCountsToNumber(int[] bitCounts) {
        int number = 0;
        for (int bitPosition = 0; bitPosition < 32; bitPosition++) {
            if (bitCounts[bitPosition] != 0) {
                number |= 1 << bitPosition;
            }
        }
        return number;
    }
}
