package C4_While;

public class While_GuGudan {
	public static void main(String[] args) {
		
		System.out.println("구구단");
		
		int i=1, j=1;
		
		while(i<10) {
			while(j<10) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
				j=j+1;
			}
		System.out.println();
		j=1;
		i=i+1;
		
		}
		
	}
}
