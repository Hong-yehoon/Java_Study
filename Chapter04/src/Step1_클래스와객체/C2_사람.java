package Step1_클래스와객체;

class 사람 {
	
		// 1. 멤버 변수
		String name, bloodtype;
		String sports;
		int age ;
		char gender;
		
		// 2. 생성자 
		사람(String n,String b, int a, char g ){
			name = n;
			bloodtype = b;
			age = a;
			gender = g;
			
		}
		사람(String s ){
			sports=s;
		}
		
		// 3. 메소드(함수)
		void 운동하기() {
			System.out.println(sports);
		}
				
}

public class C2_사람 {
	public static void main(String[] args) {
		
		//객체 생성
		
		사람 p1 = new 사람("최승희","A",45,'F');
		사람 p2 = new 사람("골프");
		사람 p3 = new 사람("축구");
		
		//객체 접근(활용)
		String n1 = p1.name;
		System.out.println("최승희님의 취미는"+n1+"입니다.");
		String n2 = p2.sports;
		System.out.println("님의 취미는"+n2+"입니다.");
		
		p1.운동하기();
		
		
		
		
	}
	
	
}
