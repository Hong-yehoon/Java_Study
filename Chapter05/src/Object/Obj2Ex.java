package Object;

class Point2 {
	int x,y;
	public Point2(int x, int y) {
		this.x=x; this.y=y;
	}
	@Override     //가져가서 재정의해서 쓸 수 있다.
	public String toString() {
		// TODO Auto-generated method stub
		return "Point("+x+","+y+")";	
	}
}
public class Obj2Ex {

	public static void main(String[] args) {
		Point2 p = new Point2(2, 3);
		System.out.println(p.toString());
		System.out.println(p);
	}
}
