public class Main {
    public static void main(String[] args) {
        int[] differences = {83702, -5216};
//        int[] differences = {3, -4, 5, 1, -2};
        int upper = 14602;
//        int upper = 5;
        int lower = -82788;
//        int lower = -4;

        class Solution {
            public int numberOfArrays(int[] differences, int lower, int upper) {
                //up-low+1-range
                long max = Integer.MIN_VALUE;
                long min = Integer.MAX_VALUE;
                long[] arr = new long[differences.length + 1];
                arr[0] = 0;
                for (int i = 0; i < differences.length; i++) {
                    arr[i + 1] = arr[i] + differences[i];
                }
                for (long j : arr) {
                    max = Math.max(max, j);
                    min = Math.min(min, j);
                }
                long range = max - min;

                if (upper - lower + 1 - range >= 0) {
                    return Math.toIntExact(upper - lower + 1 - range);
                } else {
                    return 0;
                }
            }
        }

        Solution solution = new Solution();
        int result = solution.numberOfArrays(differences, lower, upper);
        System.out.println(result);
    }
}