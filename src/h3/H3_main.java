package h3;

public class H3_main {
	public static void main(String[] args) {
		int i = 140;
		int j = 150;
		int k = -10;
		boolean m;
		boolean n;
		boolean o;
		
		if (i > j) {m = true;}
		else {m = false;}
		
		if (i > 200) {n = true;}
		else {n = false;}
		
		if (j > 100) {o = true;}
		else {o = false;}
		
		if (m && n == false && o == false) {k = 1;}
		else if (m && n && o == false) {k = 2;}
		else if (m && n && o) {k = 3;}
		else if (m == false && n == false && o == false) {k = 4;}
		
		System.out.println(k);
		
		
	}

}
