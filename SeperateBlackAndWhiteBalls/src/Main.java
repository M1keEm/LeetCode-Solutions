public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minimumSteps("000110001011010101011111110000000000000000111"));
    }

    static class Solution {
        public long minimumSteps(String s) {
            long countSwaps = 0;
            long firstSpaceForWhite = 0;
            for (int currentPosition = 0; currentPosition < s.length(); currentPosition++) {
                if (s.charAt(currentPosition) == '0') {
                    countSwaps += currentPosition - firstSpaceForWhite;
                    firstSpaceForWhite++;
                }
            }
            return countSwaps;
        }
    }
}
