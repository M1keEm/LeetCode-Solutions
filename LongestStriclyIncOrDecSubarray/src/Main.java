public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        System.out.println(main.longestMonotonicSubarray());
    }

    public int longestMonotonicSubarray(int[] nums) {
        int lengthA = 1;
        int lengthB = 1;
        int resultA = 1;
        int resultB = 1;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                lengthA++;
                resultA = Math.max(resultA, lengthA);
            } else {
                lengthA = 1;
            }

            if (nums[i] < nums[i + 1]){
                lengthB++;
                resultB = Math.max(lengthB, resultB);
            } else {
                lengthB = 1;
            }
        }
        return Math.max(resultA, resultB);
    }
}