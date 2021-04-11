package Step8_추상과인터페이스;

abstract class MyCalclulator {
	abstract public int add(int a, int b);
	abstract public int substract(int a, int b);
	abstract double average(int[]a);
}

class GoodCal extends MyCalclulator {

	@Override
	public int add(int a, int b) {
		
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	double average(int[] a) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/(float)a.length;
	}
}
public class Ab4_AbstractEx {
		public static void main(String[] args) {
			
			//업캐스팅
			MyCalclulator c = new GoodCal();
			System.out.println(c.add(2, 3));
			System.out.println(c.substract(10, 5));
			System.out.println(c.average(new int[] {10,50,68,98,45,20,60}));
		}
}
