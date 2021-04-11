package Step7_상속;

class T {
	private String name;
	private int age;
	
	T(String name, int age){
		this.name = name;
		this.age = age;
	}
	void show() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
class F extends T {
	String degree;
	F(String name, int age, String degree){
		super(name,age);
		this.degree = degree;
	}
	void show() {
		super.show();
		System.out.println("등급: "+degree);
	}
}
public class E9_상속활용 {
	
	public static void main(String[] args) {
		
	
	F f = new F("홍길동",10,"박사");
	f.show();
	
	T t = new T("배고파", 100);
	t.show();
	
	}
}
