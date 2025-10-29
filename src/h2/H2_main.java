package h2;

public class H2_main {
	public static void main(String[] args) {
		int max;
		int min;
		int i = 4;
		int j = 1;
		int k = 38;
		max = i;
		min = i;
		
		if (i < j) {max = j;}
		else if (i > j) {min = j;}
		
		if (max < k) {max = k;}
		else if (min > k) {min = k;}
		
		System.out.println(max + " " + min);
	}

}