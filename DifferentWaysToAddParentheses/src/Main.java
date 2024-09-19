import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        String expression = "2*3-4*5";
        System.out.println(main.diffWaysToCompute(expression));
    }
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*') {
                List<Integer> left = diffWaysToCompute(expression.substring(0, i));
                List<Integer> right = diffWaysToCompute(expression.substring(i + 1));
                for (int l : left) {
                    for (int r : right) {
                        if (c == '+') {
                            results.add(l + r);
                        } else if (c == '-') {
                            results.add(l - r);
                        } else {
                            results.add(l * r);
                        }
                    }
                }
            }
        }
        return results.isEmpty() ? List.of(Integer.parseInt(expression)) : results;
    }
}