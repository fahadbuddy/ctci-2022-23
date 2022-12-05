

public class URLify {

// "Hi Bob!" "Hi%20Bob!" "Hi Bob!  ", n = 7, k=9
public static String encoded(String s1, int n) {
	if (s1.length() == n) {
		return s1;
	}

	char[] result = s1.toCharArray();

	int k = result.length-1; // k = 8, n = 7
	int i = n-1; // k = 8, i = 6

	while(k >=0) {
		if (result[i] == ' ') {
			result[k--]='0';
			result[k--]='2';
			result[k--]='%';
			i--;
		} else {
			result[k--]=result[i--]; // k = 7, i=5 // res	ult="Hi Bob! !" //result="Hi BBob!"
		}
	}
	return new String(result);
}

    public static void main(String[] args) {
        System.out.println(encoded("Hi Bob!  ", 7));
    }
    
}
