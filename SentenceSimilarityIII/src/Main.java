import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String sentence1 = "My name is Haley";
        String sentence2 = "My Hale";
        System.out.println(main.areSentencesSimilar(sentence1, sentence2));
    }


    public boolean areSentencesSimilar(String s1, String s2) {
        Deque<String> deque1 = new ArrayDeque<>(Arrays.asList(s1.split(" ")));
        Deque<String> deque2 = new ArrayDeque<>(Arrays.asList(s2.split(" ")));
        //Compare the prefixes or beginning of the strings.
        while (
                !deque1.isEmpty() &&
                        !deque2.isEmpty() &&
                        deque1.peek().equals(deque2.peek())
        ) {
            deque1.poll();
            deque2.poll();
        }
        // Compare the suffixes or ending of the strings.
        while (
                !deque1.isEmpty() &&
                        !deque2.isEmpty() &&
                        deque1.peekLast().equals(deque2.peekLast())
        ) {
            deque1.pollLast();
            deque2.pollLast();
        }
        return deque1.isEmpty() || deque2.isEmpty();
    }
}
