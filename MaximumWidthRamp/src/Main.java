import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {6, 0, 8, 2, 1, 5};
        System.out.println(main.maxWidthRamp(nums));

    }

    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (a, b) ->
            nums[a] == nums[b] ? a - b : nums[a] - nums[b]); //if the values are the same, sort by index, otherwise sort by value of num[index]
        int maxWidth = 0;
        int minIndex = n;
        for (int index : indices) {
            maxWidth = Math.max(maxWidth, index - minIndex);
            minIndex = Math.min(minIndex, index);
        }
        return maxWidth;
    }
}
