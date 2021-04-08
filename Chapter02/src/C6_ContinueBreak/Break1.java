package C6_ContinueBreak;

public class Break1 {

	public static void main(String[] args) {
		
		int num=0, sum=0;
		
		while(true) {
			num++;		//계속 증가
			sum+=num;	//계속 더하기
		 if(num==100) {
			 break;			//해당 반복문을 빠져나온다.
		 }
		}
		System.out.println("합계:"+sum);
	}
}
