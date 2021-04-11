package Step8_추상과인터페이스;

interface Volume {
	void volumeup();
	void volumDown();
}
class TV implements Volume {

	@Override
	public void volumeup() {
		System.out.println("TV소리 크게");
	}

	@Override
	public void volumDown() {
		System.out.println("TV소리 작게");
	}
}
class Audio implements Volume {

	@Override
	public void volumeup() {
		System.out.println("Audio 소리 크게");
	}

	@Override
	public void volumDown() {
		System.out.println("Audio 소리 작게");
	}
	
}
class Speaker implements Volume{

	@Override
	public void volumeup() {
		System.out.println("Speaker 소리 크게");
	}

	@Override
	public void volumDown() {
		System.out.println("Speaker 소리 작게");
	}
	
}
public class T3_Volume {

		public static void main(String[] args) {
			
			Volume tvv = new TV();
			tvv.volumeup();
			tvv.volumDown();
			
			Volume adv = new Audio();
			adv.volumeup();
			adv.volumDown();
			
			Volume spv = new Speaker();
			spv.volumeup();
			spv.volumDown();
}
}
