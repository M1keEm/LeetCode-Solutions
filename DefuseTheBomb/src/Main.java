public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] code = {5,7,1,4};
        int k = 3;
        int[] res = decrypt(code, k);
        for (int re : res) {
            System.out.print(re + " ");
        }
    }

    public static int[] decrypt(int [] code, int k){
        int n = code.length;
        int[] res = new int[n];
        if(k == 0){ // if k == 0, then all elements will be 0
            return res;
        }
        for(int i = 0; i < n; i++){
            int sum = 0;
            if(k > 0){
                for(int j = 1; j <= k; j++){
                    sum += code[(i+j)%n]; // if i+j >= n, then it will be i+j-n
                }
            }else{
                for(int j = 1; j <= -k; j++){ // if k is negative, then we need to use -k to get the absolute value
                    sum += code[(i-j+n)%n];
                }
            }
            res[i] = sum;
        }
        return res;
    }
}