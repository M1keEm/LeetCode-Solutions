import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        // Create a max-heap to store the elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Collections.reverseOrder()
        );

        for (int i : nums) {
            pq.add(i);
        }

        while (k-- > 0) {
            // Add the maxElement in ans and push its one-third value in the
            // priority queue
            int maxElement = pq.poll();
            ans += maxElement;
            pq.add((int) Math.ceil(maxElement / 3.0));
        }
        return ans;
    }
}