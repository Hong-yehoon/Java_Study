package Step5_Method;

class Array{
		void print(int [] at ) {	//정수형 배열을 받는다.
			
			//받은 배열에서 값을 입력한다.
			for(int i=0; i<at.length; i++) {
				at[i] =at[i]+i;
			}
			
			//출력
			for(int i=0; i<at.length; i++) {
				System.out.print(at[i]+" ");
			}
			System.out.println();
		}
}
public class M4_ArrayEx {

	public static void main(String[] args) {
		
		Array ar = new Array();
		
		//int[] arr = new int[5];
		int [] arr = {10,20,30,40,50};
		
		ar.print(arr);
	}
}









