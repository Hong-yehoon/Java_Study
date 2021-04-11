package bak;

public class Protected_A {

	protected int a;
	protected String a() {
		return "Protected_A클래스의 값은"+a+"입니다";
	}
	protected void printA() {
		System.out.println("여기사ㅓ 다른 패키지의 protected 지정 메소드");
	}
}
