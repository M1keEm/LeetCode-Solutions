import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }


    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        int totalSum = 0;

        // calculate the totalSum and target remainder
        for (int num : nums) {
            totalSum = (totalSum + num) % p;
        }

        int target = totalSum % p;
        if (target == 0) {
            return 0; // the array is divisible by p case
        }

        HashMap<Integer, Integer> modMap = new HashMap<>();
        modMap.put(0, -1); // when the whole prefix is the answer
        int currentSum = 0;
        int minLen = n;

        for (int i = 0; i < n; ++i) {
            currentSum = (currentSum + nums[i]) % p;

            // calculate what we need to remove
            int needed = (currentSum - target + p) % p;

            // if the need remainder is present in the hashmap, consider current subarray
            if (modMap.containsKey(needed)) {
                minLen = Math.min(minLen, i - modMap.get(needed));
            }

            // store the current remainder and its index in the hashmap
            modMap.put(currentSum, i);
        }

        // if the result exists, ergo it is other than the predefined value of n, return said result
        return minLen == n ? -1 : minLen;
    }
}
