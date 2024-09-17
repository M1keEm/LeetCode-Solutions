import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 3, 6, 7, 3, 4, 4, 5};
        System.out.println(isPossibleToSplit(nums));
    }

    public static boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1]) {
                if (nums[i + 1] == nums[i + 2]) {
                    return false;
                }
            }
        }
        return true;
    }
}