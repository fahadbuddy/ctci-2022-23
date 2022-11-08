public class IsUniqueAttempt2 {
    public static boolean isUnique (String toTest) {
        if (toTest.length() > 128) {return false;}
        boolean[] checker = new boolean[128];
        for(int i = 0; i < toTest.length(); i++) {
            if (checker[toTest.charAt(i)]) {return false;}
            checker[toTest.charAt(i)] = true;
        }
        return true;
    }

    public boolean isUnique(StringBuilder toTest) {
        //impossible to do it without an intermediate data structure in java, so will need to use toCharArray()
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isUnique("abcde"));
        System.out.println(isUnique("aaaa"));
        System.out.println(isUnique("a"));
    }
}
