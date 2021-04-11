package Step7_상속;
class Car{
	int a =7;
	void move() {
		System.out.println("이동한다.");
	}
}
//*******************************************
class Bus extends Car {
	int a =25;
	void move() {
		System.out.println("40명을 태우고 이동한다.");
	}
}
class Ambulance extends Car{
	void special() {
		System.out.println("환자를 태우고 있다.");
	}
}
class FireEngine extends Car{
	int a =11;
	void move() {
		System.out.println("물을 뿌리면서 이동한다.");
	}
}
public class Ex15_오버라이딩 {
	public static void main(String[] args) {
		
		Car [] car = new Car[3];
		
		//업캐스팅
		car [0] = new Bus();
		car [1] = new Ambulance();
		car [2] = new FireEngine();
		
		for (Car c :car) {			
			c.move();
			System.out.println(c.a);
			
			if(c instanceof Ambulance) {
				Ambulance am = (Ambulance)c;
				am.special();
			}
		}
	}
	
}
