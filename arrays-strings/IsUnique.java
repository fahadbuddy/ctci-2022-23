
public class IsUnique {
    public static boolean isUnique(String test) {
        if (test.length() > 128) {
            return false;        
        }
    
        boolean[] check = new boolean[128];
        for (char t: test.toCharArray()) { // <-- can't do this because it creates a new Array
            if (check[t] == true) {
                return false;
            } else {
                check[t] = true;
            }
        }
        return true;
    
    }

    public static boolean isUnique2(String test) {
        if (test.length() < 2) {
            return true;
        }
        char[] testArr = test.toCharArray(); // <-- Can't Do This Because this will create a new Array!
        java.util.Arrays.sort(testArr);
        char prev = testArr[0];
        for (int i = 1; i < testArr.length; i++) {
            if (testArr[i] == prev) {
                return false;
            }
            prev = testArr[i];
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(isUnique("abcdea"));
        System.out.println(isUnique2("abcdea"));
    }
}

