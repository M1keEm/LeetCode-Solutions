public class Main {
    public static void main(String[] args) {
        System.out.println(makeFancyString("aaabaaaa"));
    }

    public static String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        // count consecutive equal characters
        int counter = 1;

        // iterate through the whole string
        for (int i = 1; i < s.length(); i++) {
            // if two consecutive characters are equal increment counter
            if (s.charAt(i) == s.charAt(i - 1)) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter == 3) {
                counter--;
            } else {
                sb.append(s.charAt(i));
            }

        }
        return sb.toString();
    }
}