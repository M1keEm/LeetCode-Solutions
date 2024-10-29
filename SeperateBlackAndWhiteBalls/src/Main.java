public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.minimumSteps("00011000111"));
    }

    static class Solution {
        public long minimumSteps(String s) {
            long countSwaps = 0;
            long firstSpaceForWhite = 0;
            char[] arr = s.toCharArray();
            for (int currentPosition = 0; currentPosition < arr.length; currentPosition++) {
                if (arr[currentPosition] == '0') {
                    countSwaps += currentPosition - firstSpaceForWhite;
                    firstSpaceForWhite++;
                }
            }
            return countSwaps;
        }
    }
}