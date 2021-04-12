package StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizer2 {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("홍길동/홍예훈/홍철훈/홍효진/홍유정/","/");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}

