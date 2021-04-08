/*
	이순신 홍길동 강감찬
	박유정 홍예훈 김효진
	김형주 인정빈 임택균
	
	
*/

package C1_Array;

public class Array7_정방형이차원배열 {

	public static void main(String[] args) {
		String [][] str = new String [][] {
			{"이순신","홍길동","강감찬"},{"박유정","홍예훈","김효진"},{"김형주","인정빈","임택균"}
			};
			for(int i=0; i<str.length; i++ )  { //행
			for(int j=0; j<str[i].length; j++) {
				System.out.print(str[i][j]+" ");
		}
		System.out.println();	
	}
			char [][] ch = new char [][] {
				{'a','b','c','d','e'},{'f','g','h','i','j'}
				};
				for(int i=0; i<ch.length; i++ )  { //행
				for(int j=0; j<ch[i].length; j++) {
					System.out.print(ch[i][j]+" ");
				}
			System.out.println();
		}
	}			
}
