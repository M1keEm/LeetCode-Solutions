public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 2};
        System.out.println(longestSubarray(nums));
    }

    public static int longestSubarray(int[] nums) {
        int max = 0;
        int count = 0;
        int answer = 0;

        for (int num : nums) {
//            System.out.println(num);
            if (num > max) {
                max = num;
                answer = count = 0;
            }
            if (num == max) {
                count++;
                answer = Math.max(answer, count);
            } else {
                count = 0;
            }
        }
        return answer;
    }
}
