import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(lexicographicalOrder(13));
    }

    public static List<Integer> lexicographicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int lex = 1; //we start with 1 - the lexicographically first number
        for (int i = 0; i < n; i++) {
            result.add(lex);
            if (lex * 10 <= n) {
                lex *= 10; //we start from 1, then move to 10 11 12, then to 20 21 22 and so on if possible
            }else{
                while(lex % 10 == 9 || lex >=n){
                    lex /= 10; //remove the last digit of the current lex number
                }
                lex++;
            }
        }
        return result;
    }
}