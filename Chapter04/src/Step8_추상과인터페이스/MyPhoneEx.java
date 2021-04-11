package Step8_추상과인터페이스;

interface MobilePhone extends Phone {
	
	void sendSMS();
	void receiveSMS();
}
interface MP3Interface extends Phone {
	void play();
	void stop();
	
}
interface MusicPhone extends Phone,MP3Interface {

	void playMP3RingTone();
}
class MyPhone implements MusicPhone, MobilePhone{

	@Override
	public void sendCall() {
		System.out.println("내폰은 전화를 걸 수 ㅇ;ㅆ숨");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 받기");
	}

	@Override
	public void play() {
		System.out.println("음악감상");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMP3RingTone() {}
	
}
interface AIInterface {
	void reconizeSpeech();
	void systhesizeSpeech();
	
}
public class MyPhoneEx {

	public static void main(String[] args) {
		
		MyPhone mp = new MyPhone();
		mp.sendCall();
		mp.play();
	}

}
