package Step7_상속;

class Parent{
	int x =100;
	
	public Parent() {
		this(200);
		System.out.println("실행1. 이때 x 값은?"+x);
	}
	Parent(int x) {
		System.out.println("실행2. 이때 x 값은?"+this.x);
		this.x= x;
		System.out.println("실행3. 이때 x 값은?"+this.x);
	}
	int getX() {
		return x; 				//이떄 x값은?
	}
}
class Child extends Parent{
	int x=3000;
	public Child() {
		this(1000);
		System.out.println("실행4. 이때 x 값은?"+this.x);
	}
	Child(int x){
		//super(x);
		System.out.println("실행5. 이때 x 값은?"+this.x);
		this.x =x;
		System.out.println("실행6. 이때 x 값은?"+this.x);
	}
	int getY() {
		return x; 			//이떄 x값은?
	}
}

public class E7_SuperTest {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		System.out.println("x= "+c.getX());
		System.out.println("x= "+c.getY());
	}
}
