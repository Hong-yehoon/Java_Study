package Step5_Method;

class Num {
	
	void print() {
		System.out.println("매개 변수가 없는 메소드");
	}
	void print(int a) {
		System.out.println("매개변수가 1ㄱ개"+a);
	}
	void print(String x) {
		System.out.println("매개변수가 1ㄱ개"+x);
	}
	void print(int x, String str) {
		System.out.println("매개변수가 2개"+str);
	}
}

public class M6_오버로딩1Ex {
	public static void main(String[] args) {
		Num n = new Num();
		
		n.print();
		n.print(7);
		n.print("배고파ㅣ");
		n.print(17,"밥모먹지");
		}
}
