package Step3_Constructor;

class Subscribe{
	String name;			//private 를 붙이면 소속되어 있는 클래스에서만 호출 할 수 있다. (보안용으로 많이사용)
	String phone;
	
	public Subscribe(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	void changePhone(String phone) {
		this.phone = phone;
		
	}
	void print() {
		System.out.println("이름 : "+name+", 전화번호 : "+phone);
	}
}


public class C4_SubscribeEx {

	public static void main(String[] args) {
		Subscribe s1 = new Subscribe("홍길동", "010-1234-1245");
		Subscribe s2 = new Subscribe("이순신", "010-7894-1245");
		
		s1.name = "홍예훈";
		s1.phone = "010-3381-3562";
		
	}
}
