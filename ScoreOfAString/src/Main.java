public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.scoreOfString("hello"));
    }

    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length()-1; i++) {
            sum += Math.abs(s.charAt(i) - s.charAt(i+1));
        }

        return sum;
    }
}