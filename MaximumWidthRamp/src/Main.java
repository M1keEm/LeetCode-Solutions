import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int [] nums = {6,0,8,2,1,5};
        System.out.println(main.maxWidthRamp(nums));

    }

    public int maxWidthRamp(int [] nums){
        int n = nums.length;
        int maxWidth = 0;
        for(int i = 0; i<n; ++i){
            for(int j = i + 1; j<n; ++j){
                if(nums[i] <= nums[j]){
                    maxWidth = Math.max(maxWidth, j-i);
                }
            }
        }
        return maxWidth;

    }
}