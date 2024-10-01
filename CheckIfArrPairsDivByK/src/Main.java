import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            if (rem == 0) {
                if (remainderCount.get(rem) % 2 == 1) {   //if the remainder of an element is even, the number of such elements mush be even
                    return false;
                }
            } else if (!Objects.equals(remainderCount.get(rem), remainderCount.get(k - rem))) {
                return false;
            }
        }
        return true;
    }
}
