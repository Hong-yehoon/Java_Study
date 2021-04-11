//클래스간 포함관계: 다른 클래스를 이 클래스에 멤버처럼 사용하도록 구현한 것.

package Step9_포함관계;

//포함시킬 클래스
class Engine {
	String type;
	int cc;
	//초기화
	public Engine(String type, int cc) {
		this.type = type;
		this.cc = cc;
	}
	void print() {
		System.out.println("타입: "+type);
		System.out.println("배기량: "+cc+"cc");
	}
}
//사용할 클래스
class Car {
	String kind;
	Engine eg;		//Engine 클래스 객체레퍼런스 선언
	
	Car(String kind, Engine eg){	//생성자에 engine 클래스를 매개변수로 받는다. //new해서 바로 집어 넣겠다 
										//아니면 메소드 만들어서 초기화 가능
		this.kind = kind;
		this.eg = eg;
	}
	void print() {
		System.out.println("차 종:"+kind);
		eg.print();		//포함시킨 객체에 
		System.out.println("===================");
		
	}
}

public class CarEx {

		public static void main(String[] args) {
			
			Engine eg1 = new Engine("알파엔진", 2000);
			Engine eg2 = new Engine("베타엔진", 3000);
			Engine eg3 = new Engine("감마엔진", 3500);
			
			Car c1 = new Car("모닝", eg1);
			Car c2 = new Car("소나타", eg2);
			Car c3 = new Car("벤츠", eg3);
		
			c1.print();
			c2.print();
			c3.print();
		}
}
