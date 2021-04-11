//클래스 안에 클래스 생성 및 활용


package Step9_포함관계;

import java.util.WeakHashMap;

class Outer {
	int width = 10;
	int height = 10;
	
	public Outer(int width, int height) {
		this.height = height;
		this.width = width;
	}
	
	public Inner getInner() {
		return new Inner();
		
	}
	//클래스 속에 클래스
	class Inner {
		int depth = 10;
		public int volume () {
			return width*height*depth;
		}
	}
}

public class InnerEx {

	public static void main(String[] args) {
		
		Outer out1 = new Outer(100, 100);
		Outer out2 = new Outer(200, 100);
		
		Outer.Inner in1 = out1.new Inner();
		Outer.Inner in2 = out1.getInner();		//객체 생성
		 
	}
}
