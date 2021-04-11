package Step7_상속;

class Obj {
	void print () {
		System.out.println("요일");
	}
}
//**********************************
class Mon extends Obj {

	@Override
	void print() {
		super.print();
		System.out.println("월요일");
	}
	
}
class Thu extends Obj {

	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("화요일");
	}
}
class Wed extends Obj {

	@Override
	void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("수요일");
	}
	
}
public class E14_오버라이딩연습 {
		public static void main(String[] args) {
			
			//각 요일을 오버라이딩 활용해서 동적 바인딩을 시켜 실행해 보세요 
			
			Obj obj = new Obj();
			
			
		}
}
