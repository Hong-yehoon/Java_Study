package C1_Array;

public class Array10_배열복사 {
		public static void main(String[] args) {
			char [] a = new char [] {'가','나','다','라','마','바'};
			
			char [] b = new char[6];
			System.out.println(a);
			//복사
			for(int i=0; i<a.length; i++) {
				b[i] = a[i];
				
			}
			//출력
			for(char k:b) {
				System.out.print(k+"");
			}
			
			
			System.out.println(); //줄바꿈
			
			
		//배열을 복사해주는 기능을 가진 메소드 활용 - System.arraycopy()
		//b배열 초기화
			for(int i=0; i<b.length; i++) {
				b[i]='*';
			}
			//복사 메소드 활용
		System.arraycopy(a, 1, b, 1, 2);   //원본배열, 시작, 복사될 배열, 복사시작점, 복사개수
		
		//복사확인
		for(char k:b) {
			System.out.print(k+" ");
		}
		}
		
		
}
