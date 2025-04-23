import java.util.HashMap;

public class CountLargestGroup {
    public static void main(String[] args) {
        int n = 13;
        CountLargestGroup countLargestGroup = new CountLargestGroup();
        int result = countLargestGroup.countLargestGroup(n);
        System.out.println(result);
    }

    public int countLargestGroup(int n) {
        // Map digit sum -> count of numbers with that sum
        HashMap<Integer, Integer> groups = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int digitSum = getDigitSum(i);
            // Increment count for this digit sum
            groups.put(digitSum, groups.getOrDefault(digitSum, 0) + 1);
        }

        // Find the maximum size of any group
        int maxSize = 0;
        for (int count : groups.values()) {
            maxSize = Math.max(maxSize, count);
        }

        // Count how many groups have this maximum size
        int result = 0;
        for (int count : groups.values()) {
            if (count == maxSize) {
                result++;
            }
        }

        return result;
    }

    private int getDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
