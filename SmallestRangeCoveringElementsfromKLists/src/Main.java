import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        int n = nums.size();
        int[] indices = new int[n]; // Stores the current index of each list
        int[] range = new int[]{0, Integer.MAX_VALUE}; // To track the smallest range

        while (true) {
            int curMin = Integer.MAX_VALUE,
                    curMax = Integer.MIN_VALUE,
                    minListIndex = 0;

            // Find the current minimum and maximum values across the lists
            for (int i = 0; i < n; i++) {
                int currentElement = nums.get(i).get(indices[i]);

                // Update the current minimum
                if (currentElement < curMin) {
                    curMin = currentElement;
                    minListIndex = i;
                }

                // Update the current maximum
                if (currentElement > curMax) {
                    curMax = currentElement;
                }
            }

            // Update the range if a smaller one is found
            if (curMax - curMin < range[1] - range[0]) {
                range[0] = curMin;
                range[1] = curMax;
            }

            // Move to the next element in the list that had the minimum value
            if (++indices[minListIndex] == nums.get(minListIndex).size()) break;
        }

        return range;
    }
}