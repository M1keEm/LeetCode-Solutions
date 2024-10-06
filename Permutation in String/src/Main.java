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

        for (int i = 0; i < s1.length(); i++) {
            s1Letters[s1.charAt(i) - 97]++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2Letters = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s2Letters[s2.charAt(i + j) - 97]++;
            }
            if (matches(s1Letters, s2Letters)) {
                return true;
            }
        }
        return false;
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
