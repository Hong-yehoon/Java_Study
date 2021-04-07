package C3_Print;

public class Print1 {
	
	public static void main (String args[]) {
		
		//print 
		System.out.print("Hello \n");
		System.out.print("Java~ \n");
		
		//println - 줄바꿈
		System.out.println("Hello");
		System.out.println("Java");
		
		//printf
		System.out.printf("%c \n",'가');
		System.out.printf("%d \n",100);
		System.out.printf("%s \n","안드로이드");
		System.out.printf("%.1f \n",1.2);
		
		
		///(과목전체의) 평균은 (90.123)점입니다.
		
		System.out.printf("%s","과목전체의");
		System.out.print(" 평균은 ");
		System.out.printf("%.3f",90.123);
		System.out.print(" 입니다.");

	
	}

}
