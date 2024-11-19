import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Test cases
        int[] nums1 = {1, 2, 1, 2, 6, 7, 5, 1};
        int k1 = 2;
        int[] nums2 = {1, 2, 1, 2, 6, 7, 5, 1};
        int k2 = 3;
        int[] nums3 = {1, 2, 1, 2, 9, 7, 5, 1};
        int k3 = 4;

        System.out.println(maximumSubarraySum(nums1, k1)); // 13
        System.out.println(maximumSubarraySum(nums2, k2)); // 18
        System.out.println(maximumSubarraySum(nums3, k3)); // 20
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        long answer = 0L;
        long currentSum = 0L;
        int begin = 0, end = 0;
        HashMap<Integer, Integer> lastOccurrence = new HashMap<>(); // stores last occurrence of every number
        while (end < nums.length) {
            int currentNumber = nums[end];
            int lastOccurrenceIndex = lastOccurrence.getOrDefault(currentNumber, -1);
            while (begin <= lastOccurrenceIndex || end - begin + 1 > k) { // if the current number has been seen before, or the window size is greater than k
                currentSum -= nums[begin]; // remove the number at begin from the sum
                begin++; // move the beginning pointer to the right
            }
            lastOccurrence.put(currentNumber, end); // update the last occurrence of the current number
            currentSum += nums[end]; // add the current number to the sum
            if (end - begin + 1 == k) { // if the window size is equal to k
                answer = Math.max(answer, currentSum); // update the answer
            }
            end++;
        }
        return answer;
    }
}