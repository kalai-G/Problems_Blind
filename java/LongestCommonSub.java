import java.util.*;
public class LongestCommonSub {

    public static void main(String[] args) {
        String str1 = "ABCDGH";
        String str2 = "ABEDGHC";
        int maxLength = 0;
        int index = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : str1.toCharArray()) {
            set.add(c);
        }
        for(int i=0;i < str2.length(); i++) {
            if(set.contains(str2.charAt(i))) {
                index++;
            }
            else{
                index = 0;
            }
            maxLength = Math.max(maxLength, index);

        }
        System.out.println("Common subsequence exists");
        System.out.println("Length of longest common subsequence: " + maxLength);
    }
}