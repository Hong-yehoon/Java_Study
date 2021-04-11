package Step2_Variable;

public class V9_Parking {

		//멤버변수
		String name;
		int inTime;
		int outTime;
		
		final int AMTPERTIME = 3000;		//시간당 삼천원
		
		//생성자
			public V9_Parking(String name, int inTime, int outTime) {
				this.name = name;
				this.inTime = inTime;
				this.outTime = outTime;
			
			}
		//메소드
			void print() {
				int fee = (outTime-inTime)*AMTPERTIME;	//주차비
				
				System.out.println("차이름 : "+name);
				System.out.println("입차시간 : "+inTime); 
				System.out.println("출고시간 : "+outTime);
				System.out.println("주차요금 : "+fee);
				System.out.println("*******************");
				
			}
			
		public static void main(String[] args) {
			
			V9_Parking car1 = new V9_Parking("6003",16,19);
			V9_Parking car2 = new V9_Parking("1788",10,17);
			
			car1.print();
			car2.print();
			
		}
		
		
}
