import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1,1,1,1};
        int m = 4;
        int n = 1;
        int[][] array = construct2DArray(original, m, n);
        System.out.println(Arrays.deepToString(array));
//        int[][] newArr = new int[3][5];
//        System.out.println(Arrays.deepToString(newArr));
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] array = new int[m][n];
        if (original.length != m * n) {
            return new int[][]{};
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = original[index];
                index++;
            }
        }
        return array;
    }
}