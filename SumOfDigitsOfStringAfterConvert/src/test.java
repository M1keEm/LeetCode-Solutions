class test {
    public static void main(String[] args) {
        System.out.println(getLucky("fleyctuuajsr", 5));
    }

    public static int getLucky(String s, int k) {
        if (s.isEmpty()) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int idx = (ch - 'a') + 1;
            sb.append(idx);
        }
        String num = sb.toString();
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (char ch : num.toCharArray()) {
                sum += (ch - '0'); //conversion from char to int by subtracting '0'('5' is 5, without subtracting it would be 53 - its ASCII value)
            }
            num = String.valueOf(sum);
        }
        return Integer.parseInt(num);
    }
}
