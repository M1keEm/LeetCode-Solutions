import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String result = LargestNumber(nums);
    }

    public static String LargestNumber(int[] nums){
        String[] stringArray = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            stringArray[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(stringArray, (a, b) -> (b + a).compareTo(a + b));
        if(stringArray[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : stringArray) {
            sb.append(s);
        }
        return sb.toString();
    }
}