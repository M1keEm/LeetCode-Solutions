public class Main {
    public static void main(String[] args) {
        System.out.println(isCircularSentence("Hello oorlH"));
    }

    public static boolean isCircularSentence(String sentence) {
        // check every first and last character of every word of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != sentence.charAt(i - 1)) {
                return false;
            }
        }
        // check first and last letter of the sentence
        return sentence.charAt(sentence.length() - 1) == sentence.charAt(0);
    }
}