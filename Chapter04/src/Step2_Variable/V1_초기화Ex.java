package Step2_Variable;

public class V1_초기화Ex {

	public static void main(String[] args) {
		
		//1. 객체 생성
		V1_초기화1 mCar = new V1_초기화1();
		V1_초기화1 yCar = new V1_초기화1();
		
		mCar.color="빨강";
		yCar.color="초록";
		
		System.out.println("내 차는...");
		mCar.speed = 200;
		mCar.speedUp(); //메소드 호출
		yCar.speedUp();
		
		//print 메소드 호출
		
		mCar.print();
		yCar.print();
	}
}
