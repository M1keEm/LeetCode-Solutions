import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String x = "eleetminicoworoep";
        System.out.println(findTheLongestSubstring(x));

    }

    public static int findTheLongestSubstring(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Base case: bitmask 0 occurs at index -1

        int maxLength = 0;
        int bitmask = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Update the bitmask based on the current character
            switch (c) {
                case 'a':
                    bitmask ^= (1); // Toggle the 1st bit
                    break;
                case 'e':
                    bitmask ^= (1 << 1); // Toggle the 2nd bit
                    break;
                case 'i':
                    bitmask ^= (1 << 2); // Toggle the 3rd bit
                    break;
                case 'o':
                    bitmask ^= (1 << 3); // Toggle the 4th bit
                    break;
                case 'u':
                    bitmask ^= (1 << 4); // Toggle the 5th bit
                    break;
            }

            // Check if the bitmask has been seen before
            if (map.containsKey(bitmask)) {
                int startIndex = map.get(bitmask); // Get the index of the first occurrence of this bitmask
                int length = i - startIndex; // Calculate the length of the current substring, works because if the bitmask is the same, the vowels changes cancel each other out
                maxLength = Math.max(maxLength, length);
            } else {
                // Record the first occurrence of this bitmask
                map.put(bitmask, i);
            }
        }

        return maxLength;
    }
}