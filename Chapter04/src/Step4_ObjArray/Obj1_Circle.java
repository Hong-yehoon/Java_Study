package Step4_ObjArray;

class Circle{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	//메소드
	double getArea() {
		return 3.14*radius*radius;
		
	}
}

public class Obj1_Circle {

	public static void main(String[] args) {
		
		//1. 먼저 객체배열을 선언해서 생성한다.
		Circle[] c = new Circle[10];
		
		//2. 반복문을 활용해서 순차적으로 객체를 입력한다.
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i);
			
		}
		
		//3. 메소드 호출
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i].radius);
			System.out.println(c[i].getArea());
			System.out.println("***************");
		}
	 }
	
}
