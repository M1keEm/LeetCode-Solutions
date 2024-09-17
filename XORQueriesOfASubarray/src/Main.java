public class Main {
    public static void main(String[] args) {
        int [] que = xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{2, 3}, {0, 3}, {3, 3}});
    }

    public static int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] xor = new int[arr.length];
        xor[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            if (queries[i][0] == 0) {
                answer[i] = xor[queries[i][1]];
            } else {
                answer[i] = xor[queries[i][1]] ^ xor[queries[i][0]-1];
            }
        }
        return answer;
    }
}

