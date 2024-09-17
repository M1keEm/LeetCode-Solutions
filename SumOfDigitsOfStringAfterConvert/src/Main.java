import java.math.BigInteger;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(getLucky("fleyctuuajsr", 5));
        int[][] arr = {{}};
        System.out.println(Arrays.deepToString(arr));
    }

    public static BigInteger convert(String s) { // Converts string to BigInteger
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 96;
            sb.append(num);
        }
        return new BigInteger(sb.toString());
    }

    public static int getLucky(String s, int k) {
        BigInteger converted = convert(s);
        int sum = 0;
        while (converted.compareTo(BigInteger.ZERO) > 0) {
            sum += converted.mod(BigInteger.TEN).intValue();
            converted = converted.divide(BigInteger.TEN);
        }
        for (int i = 1; i < k; i++) {
            converted = BigInteger.valueOf(sum);
            sum = 0;
            while (converted.compareTo(BigInteger.ZERO) > 0) {
                sum += converted.mod(BigInteger.TEN).intValue();
                converted = converted.divide(BigInteger.TEN);
            }
        }
        return sum;
    }
}