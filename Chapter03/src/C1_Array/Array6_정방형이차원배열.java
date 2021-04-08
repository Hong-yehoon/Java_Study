package C1_Array;

public class Array6_정방형이차원배열 {

	public static void main(String[] args) {
		
	
		//정방형배열 선언방법
		int[][] a = new int [2][3]; 	//2행 3열
										//		[][][]
										//		[][][]
		//초기화
		a[0][0] = 7; a[0][1] = 23; a[0][2] = 11;		//[7] [23] [11]
		a[1][0] =27; a[1][1] =  2; a[1][2] = 13;		//[27] [2] [13]
	
		//출력
		for(int i=0; i<a.length; i++ )  { //행
			for(int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();  //줄바꿈
		}
	//아래와ㅓ 같은 정방형 배열을 생성하고 출력하시오.
		//[1][2][3][4]
		//[5][6][7][8]
		int[][] b = new int [2][4];
		//int [][] b = {{1,2,3,4},{5,6,7,8}}
		
		b[0][0] = 1; b[0][1] = 2; b[0][2] = 3; b[0][3] = 4;
		b[1][0] = 5; b[1][1] = 6; b[1][2] = 7; b[1][3] = 8;
		
		for(int i=0; i<b.length; i++ )  { //행
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();  //줄바꿈
		}
		
	}									
}
