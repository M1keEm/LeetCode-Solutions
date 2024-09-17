public class Main {
    public static void main(String[] args) {
        System.out.println(NumberComplement(11));
    }

    public static int NumberComplement(int num) {
        int complement = 0;
        int i = 0;
        while (num > 0) {
            complement += (int) ((num % 2 == 0 ? 1 : 0) * Math.pow(2, i));
            num /= 2;
            i++;
        }
        return complement;
    }
}