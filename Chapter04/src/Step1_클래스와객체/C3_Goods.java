package Step1_클래스와객체;

public class C3_Goods {

	//필드(멤버변수)
		String name;
		int price, numberOfStock, sold;
		
	
	//생성자
		//생략 C3_Goods(){}  기본 생성자는 생략시에 컴파일 하면서 자동생성해준다.
		
		
	//메소드
		public static void main(String[] args) {
			
			//객체생성
			C3_Goods camera;
			camera = new C3_Goods();   //내 자신을 객체 생성
			
			//멤버변수값 설정
			camera.name = "Samsung";
			camera.price = 400000;
			//활용
			System.out.println("제품명:" +camera.name);
			System.out.println("판매가:" +camera.price);
		
		}
		
}
