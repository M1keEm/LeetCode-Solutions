public class Main {
    public static void main(String[] args) {
        System.out.println(palindrome(1213));
    }

    public static boolean palindrome(int x){
        if(x < 0){
            return false;
        }
        if(x==0){
            return true;
        }
        int reversed = 0;
        int original = x;
        while(x != 0){
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}