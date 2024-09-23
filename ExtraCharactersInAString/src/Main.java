//import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.minExtraChar("leetscode", new String[]{"leet","code","leetcode"}));
    }

    public int minExtraChar(String s, String[] dictionary) {
        Set<String> dict = new HashSet<>();
        Collections.addAll(dict, dictionary);
        int n = s.length();
        int[] dp = new int[n + 1]; // DP array to track the minimum extra characters
        for (int i = 0; i <= n; i++) {
            dp[i] = n; // Initialize with maximum extra characters
        }
        dp[0] = 0; // No extra characters for an empty string

        // Iterate through each index in the string
        for (int i = 1; i <= n; i++) {
            // Check all substrings ending at i
            for (int j = 0; j < i; j++) {
                String sub = s.substring(j, i); // Get substring s[j:i]
                if (dict.contains(sub)) {
                    dp[i] = Math.min(dp[i], dp[j]); // If substring found in dictionary
                }
            }
            dp[i] = Math.min(dp[i], dp[i - 1] + 1); // Consider current character as extra
        }

        return dp[n]; // Return the result from dp[n]
    }
}