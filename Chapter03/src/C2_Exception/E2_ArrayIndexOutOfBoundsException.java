package C2_Exception;

public class E2_ArrayIndexOutOfBoundsException {
	public static void main(String[] args) {
		
		int[] intArray = new int[5];
		
		
		try {
			intArray[3]=10;
			intArray[6]=5;
			System.out.println(intArray[6]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열범위 벗어남");
		}
		
		
	}
	
}
