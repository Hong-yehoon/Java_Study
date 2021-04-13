package GenericMake;



//파우더 클래스
class Powder {
	public void doPrinting() {
		System.out.println("Powder재료로 출력합니다.");
	}
	public String toString() {
		return "파우더";
	}
}
//플라스틱 클래스 
class Plastic {
	
	public void doPrinting() {
		System.out.println("Plastic 재룔로 출력");
		
	}
	public String toString() {
		return "플라스틱";
}
}
//파우더 사용 프린터
class ThreeDPrinter1{
	
	//멤버변수 - 파우더 클래스 객체타입의 변수 선언
	private Powder material; //클래스 타입의 변수를 선언
	
	//생성자 - 파우더클래스를 받아서 초기화 시킴
	public void setMaterial(Powder material) {
		this.material = material;
			
	}
	public Powder getMaterial() {		//객체를 리턴
		return material;
	}
}
//플라스틱 사용 프린터
class ThreeDPrinter2{
	
	//멤버변수 - 파우더 클래스 객체타입의 변수 선언
	private Plastic material; //클래스 타입의 변수를 선언
	
	//생성자 - 파우더클래스를 받아서 초기화 시킴
	public void setMaterial(Plastic material) {
		this.material = material;
			
	}
	public Plastic getMaterial() {		
		return material;				//객체를 리턴
	}
}

//제네릭프린터
class GenricPrinter <T>{
	
	//멤버변수 - 파우더 클래스 객체타입의 변수 선언
	private T material; //클래스 타입의 변수를 선언
	
	//생성자 - 파우더클래스를 받아서 초기화 시킴
	public void setMaterial(T material) {
		this.material = material;
			
	}
	public T getMaterial() {		
		return material;				//객체를 리턴
	}
	//추가
	@Override
	public String toString() {   //Obejct 클래스의 toString()을 재정의 한 것
		return material.toString();
	}
}
public class G3_3Dprinter {

	public static void main(String[] args) {
		
		// 1. 파우더 사용
		GenricPrinter<Powder> p1 = new GenricPrinter();
		p1.setMaterial(new Powder());   //객체 생성을 바로 
		Powder powder = p1.getMaterial();
		
		System.out.println(powder);
		System.out.println(powder.toString());
		
	}
}




