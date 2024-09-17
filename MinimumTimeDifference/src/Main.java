import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMinDifference(Arrays.asList("24:00", "00:00")));
    }

    public static int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        int[] minutes = new int[n];
        for (int i = 0; i < n; i++) {
            String[] time = timePoints.get(i).split(":");
            minutes[i] = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        }
        Arrays.sort(minutes);
        int minDiff = 1440; // 24 * 60 = 1440, maximum difference between two time points is 24 hours
        for (int i = 1; i < n; i++) {
            minDiff = Math.min(minDiff, minutes[i] - minutes[i - 1]);
        }
        minDiff = Math.min(minDiff, minutes[0] + 1440 - minutes[n - 1]); // compare the first and last time points (case 00:00 and 24:00)
        return minDiff;
    }
}