package C1_Array;
// Array3_characterArray
public class Array3 {
		public static void main(String[] args) {
			
			//a문자열 배열 선언 및 생성
			String[] str = new String[] {"산토끼","집토끼","알카리토끼"};
		
			//배열을 읽어서 출력
			for(int i=0; i<str.length; i++) {
				System.out.print(str[i]+" ");	
		
			}
			System.out.println("줄바꿈영");
			//확장 for
			for(String k: str) {
				System.out.print(k+" ");
			}
		}
		
}
