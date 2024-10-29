public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minimumSteps("011001111"));
    }

    static class Solution {
        public long minimumSteps(String s) {
            long countSwaps = 0; //count all swaps
            int blackBallCount = 0; //count all black balls

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    // Swap wti all black balls to the left
                    countSwaps += (long) blackBallCount;
                } else {
                    //increment black ball count
                    blackBallCount++;
                }
            }

            return countSwaps;
        }
    }
}
