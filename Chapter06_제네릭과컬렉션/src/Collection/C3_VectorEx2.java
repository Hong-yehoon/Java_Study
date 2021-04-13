package Collection;

import java.util.Vector;

class Point{
	private int x, y;
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+","+y+")";
	}
}
public class C3_VectorEx2 {
	
	public static void main(String[] args) {
		Vector<Point> v = new Vector<>();
		
		v.add(new Point(3, 4));
		v.add(new Point(4, 8));
		v.add(new Point(7, 5));
		
		//삭제 - 두번째 것
		v.remove(1);
		
		//모두출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
						//배열 : v[i].toString(), v[i].memberID;
			System.out.println(v.get(i).toString());
		}
	}

}
