import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        Main solution = new Main();
        int[] result = solution.twoSumOptimized(nums, target);
//        System.out.println("[" + result[0] + ", " + result[1] + "]");
//        result = solution.twoSumOptimized(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public int[] twoSumOptimized(int @org.jetbrains.annotations.NotNull [] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int lacking = target - nums[i];
            if (map.containsKey(lacking)) {
                return new int[]{map.get(lacking), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
}