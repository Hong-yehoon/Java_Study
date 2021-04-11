package Step7_상속;


class D1{
	public int x =1000;
	public void display() {
		System.out.println("부모클래스의 메소드");
	}
}
class D2 extends D1{
	public int x = 2000;
	public void display() {
		System.out.println("자식의 메소드");
	}
	public void write() {
		display();
		super.display();
		System.out.println("D2의 클래스 객체의 x값은"+x);
		System.out.println("D1의 클래스 객체의 x값은"+super.x);
	}
}

public class E8_SuperTest2 {
	public static void main(String[] args) {
		D2 d = new D2();
		d.write();
	}
	
}
