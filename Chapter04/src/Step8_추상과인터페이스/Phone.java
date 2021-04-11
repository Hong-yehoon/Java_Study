package Step8_추상과인터페이스;

public interface Phone {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	public default void printLogo(){
		System.out.println("******PHONE******");
		System.out.println(TIMEOUT);
	}
		
}
//LG폰 구현
class LGPhone1 implements Phone {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("LG폰으로 전화를 겁니다.");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("LG폰으로 전화를 받습니다.");
		System.out.println("지정된 시간은"+TIMEOUT);
	}

	@Override
	public void printLogo() {
		System.out.println("*****LGPHONE*****");
		Phone.super.printLogo();
	}
	
}

/*public class LGPhoneEwX {
	public static void main(String[] args) {
		
	}
}*/
