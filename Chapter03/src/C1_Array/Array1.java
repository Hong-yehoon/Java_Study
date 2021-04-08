/*
	배열
		- 자료형이 동일한 여러개의 값을 연이어 저장할 수 있도록 하는 저장공간의 집합체
		
		1. 선언/형식
				데이터타입[] 배열명 = new 데이터 타입[방의 갯수];
				
		2. 초기화:배열은 초기화 하지 않아도 자바에서는 초기화 해준다.  방이 다섯개 정수

*/
package C1_Array;

public class Array1 {
		public static void main(String[] args) {
			
			int[] a =new int[5]; 			// a = [정수][정수][정수][정수][정수]
											//	  a[0] a[1] a[2] a[3] a[4]
											//		배열의 길이를 구해주는 메서드 a.length()  =5
			a[0]=7;
			a[1]=8;
			a[2]=34;
			a[3]=6;
			a[4]=234;
			
			//int [] b ;		
			//b = new int[]{1,2,3,4,5}; 
			int[] b = new int[] {1,2,3,4,5};		//이렇게 선언부와 따로 쓸 때는 new 있어야함
			
			int[] c = {1,2,3,4,5};
					
			System.out.println(b[4]);
			
			for(int i=0; i<a.length; i++) {
				System.out.println("a["+i+"]="+a[i]);	
			}
			
		}
		
}
