public class Main {
    public static void main(String[] args) {
        System.out.println(shortestPalindrome("dbcded"));
    }

    //d bcded   dedcb d  db cded dedc bd |||| dbcd ed  dedc bd      dedcbdbcded
    public static String shortestPalindrome(String s) {
        int length = s.length();
        String reversedS = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < length; i++) {
            if (s.substring(0, length - i).equals(reversedS.substring(i))) {
                return new StringBuilder(reversedS.substring(0, i)).append(s).toString();
            }
        }
        return "";
    }
}