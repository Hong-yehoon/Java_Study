package Object;

class Point3 {
	int x,y;
	public Point3(int x, int y) {
		this.x=x; this.y=y;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Point3 p = (Point3) obj;
		
		if(x==p.x && y ==p.y) {	//객체속에 있는 멤버변수(필드)의 값 
			return true;
		}else {
			return false;
		}
	}


	@Override     //가져가서 재정의해서 쓸 수 있다.
	public String toString() {
		// TODO Auto-generated method stub
		return "Point("+x+","+y+")";	
	}
}
public class EqualsEx {

	public static void main(String[] args) {
		
		Point3 a = new Point3(3, 4);
		Point3 b = new Point3(3, 4);
		Point3 c = a;
		
		if(a==b) {
			System.out.println("a==b");		//서로 같은 객체이다.
			
		}
		if(a==c) {
			System.out.println("a==c");
		}
		
		//equals()
		if(a.equals(b)) {
			System.out.println("a와 b의 값이 같다.");
			
		}
		if(a.equals(c)) {
			System.out.println("a와 c의 값이 길다.");
		}
	}
	
}
