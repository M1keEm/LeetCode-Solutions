import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.checkInclusion("abc", "eidbacooo"));
    }

//    boolean flag = false;

    public boolean checkInclusion(String s1, String s2) {
        s1 = sortString(s1);
        for(int i = 0; i<= s2.length() - s1.length(); i++){
            if(s1.equals(sortString(s2.substring(i,  i + s1.length())))){
                return true;
            }
        }
        return false;

    }

    private String sortString(String s1) {
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        return new String(s1Array);
    }

}
