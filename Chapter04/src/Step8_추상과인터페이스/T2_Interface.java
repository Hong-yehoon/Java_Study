package Step8_추상과인터페이스;

interface E1 {
	void aa();
}
interface E2 extends E1 {
	void bb();
}
interface E3 extends E2 {
	void cc();
}
class EE implements E3 {

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		System.out.println("초밥");
	}

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		System.out.println("햄버거");
	}

	@Override
	public void cc() {
		// TODO Auto-generated method stub
		System.out.println("샐러드");
	}
	
}
public class T2_Interface {
		public static void main(String[] args) {
			
			//업캐스팅
			E1 e = new EE();
			e.aa();
			
			E2 e2 = new EE();
			e2.bb();
			e2.aa();
			
			E3 e3 = new EE();
			e3.cc();
			
			//메소드호출 - 오버라이딩
			
		}
}
