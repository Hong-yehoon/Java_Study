package C5_Dowhile;

public class D2_GuGudan {

	public static void main(String[] args) {
		
		int i=1;
		int j=1;
		
		do {
			do {
				System.out.println(i+"*"+"="+(i*j));
				j=j+1;
			
			}while(j<=9);
			
			System.err.println(); //줄바꿈용
			j=1;
			i=i+1;
			
		}while(i<=15);
		
	}
}
