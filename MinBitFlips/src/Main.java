public class Main {
    public static void main(String[] args) {
        System.out.println(minimumBitFlips(29, 15));
    }

    public static int minimumBitFlips(int start, int goal){
        int count = 0;
        for(int i = 0; i < 30; i++){
            if((start & 1) != (goal & 1)){
                count++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return count;
    }
}