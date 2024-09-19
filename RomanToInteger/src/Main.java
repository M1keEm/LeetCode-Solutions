public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static int romanToInt(String s){
        int result = 0;
        int previous = 0;
        int current;
        for(int i = s.length() - 1; i >= 0; i--){
            current = romanCharToInt(s.charAt(i));
            if(current < previous){
                result -= current;
            }else{
                result += current;
            }
            previous = current;
        }
        return result;
    }

    public static int romanCharToInt(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}