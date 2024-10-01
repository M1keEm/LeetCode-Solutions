public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            freq[rem]++;
        }
        if (freq[0] % 2 == 1) {
            return false;
        }
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) return false;
        }
        return true;
    }
}
