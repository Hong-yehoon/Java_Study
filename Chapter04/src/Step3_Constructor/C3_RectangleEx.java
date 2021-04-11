package Step3_Constructor;

class Shape{
	
	Shape(int w){
		System.out.println("정사각형의 넓이"+(w*w));
	}
	Shape(int w, int h){
		System.out.println("직사각형의 넓이"+(w*h));
		
	}Shape(int w, int h, int d){
		System.out.println("직육면체의 부피:"+(w*h*d));
	}
}


public class C3_RectangleEx {
	public static void main(String[] args) {
		
		//한 변의 길이가 10인 정사각형의 넓이는?
		Shape result1 = new Shape(10);
		
		//가로가 7, 높이가 9인 직사각형의 넓이는?
		Shape result2 = new Shape(7,9);
		//가로 6, 높이7, 깊이 8인 직육면체의 부피는?
		
		Shape result3 = new Shape(6,7,8);
		
		
	}
}
