package Step7_상속;
class AA{
	int a = 50;
	String b= "자바";
	
	void printA() {
		System.out.println("부모메소드입니다.");
	}
}
class BB extends AA{
	int c = 60;
	String d = "재밌다";
	
	void printB() {
		System.out.println("자식메소드입니다.");
	}
}
public class E11_업다운캐스팅연습 {

		public static void main(String[] args) {
			
		
	//기본생성
	BB b = new BB();
	System.out.println(b.c+b.d);
	b.printB();
	
	//업캐스팅
	AA aa = new BB();
	
	//다운캐스팅
	
	}
}
