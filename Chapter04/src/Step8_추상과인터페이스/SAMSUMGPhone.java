package Step8_추상과인터페이스;



public class SAMSUMGPhone implements Phone {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("삼성폰으로 전화겁니다");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("삼송폰으로 전화를 받습니다.");
	}
	//메서드 추가
	public void flash() {
		System.out.println("전화기 불빛 켜짐");
	}
	//실행메소드
	public static void main(String[] args) {
		SAMSUMGPhone sp = new SAMSUMGPhone();
		sp.printLogo();
		sp.sendCall();
		sp.receiveCall();
		sp.flash();
		
	}
}
