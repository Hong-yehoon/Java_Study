

package C1_Array;

public class Array8_비정방형배열 {
	public static void main(String[] args) {
		int[][] arr = new int[4][];
		arr[0] = new int[4];
		arr[1] = new int[1];
		arr[2] = new int[3];
		arr[3] = new int[6];
		
		//값 입력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (i+1)*10+j;
			}
		}
	//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	/*//연습
	가 나 다 라 마 
	가 나 
	가 나 다
	가 나 다 라
		*/
		char[][] hg = new char [][] {
			{'가','나','다','라','마'},{'가','나'},{'가','나','다'},{'가','나','다','라'}
		};
		
		
		/*hg[0] = new char[5];
		hg[1] = new char[2];
		hg[2] = new char[3];
		hg[3] = new char[4];*/
		
		//값 입력
	}
	
}
