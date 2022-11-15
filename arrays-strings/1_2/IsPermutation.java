import java.util.*;

public class IsPermutation {

    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
    
        char[] sortedS1 = s1.toCharArray();
        char[] sortedS2 = s2.toCharArray();
        
        Arrays.sort(sortedS1);
        Arrays.sort(sortedS2);
    
        for(int i = 0; i < sortedS1.length; i++) {
            if (sortedS1[i] != sortedS2[i]) {
                return false;
            }
        }
    
        return true;
    
    }

    public static void main(String[] args) {
      System.out.println(isPermutation("cab", "bac"));  
      System.out.println(isPermutation("aaa", "bac"));  
      System.out.println(isPermutation("cab", "back"));  
    }    
}
