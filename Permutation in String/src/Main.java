public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.checkInclusion("abc", "eidbacooo"));
    }

//    boolean flag = false;

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Letters = new int[26];
        int[] s2Letters = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Letters[s1.charAt(i) - 97]++;
            s2Letters[s2.charAt(i) - 97]++;
        }

        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1Letters, s2Letters)) {
                return true;
            }
            s2Letters[s2.charAt(i) - 97]--;
            s2Letters[s2.charAt(i + s1.length()) - 97]++;
        }
        return matches(s1Letters, s2Letters);
    }

    public boolean matches(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
