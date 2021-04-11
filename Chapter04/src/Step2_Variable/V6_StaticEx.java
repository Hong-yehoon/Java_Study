package Step2_Variable;

class Static {
	
	//멤버 변수
	int a=7;
	static int b =10;
	
	//인스턴스 (Static 없음)
	void print1() {
		System.out.println("a="+a+", b"+b);
		
	}
	
	//클래스 메소드
	static void print2() {
		System.out.println("a="+", b="+b);
	}
	//클래스 메소드
	static void print3() {
		System.out.println("b="+b);

 }
}
public class V6_StaticEx {

	public static void main(String[] args) {
		
		//객체생성전
		Static.b = 10;
		System.out.println(Static.b);
		Static.print2();
	}
}
	
