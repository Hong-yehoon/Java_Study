package Step3_Constructor;

class Sonata{
	
	Sonata(){
		System.out.println("기본생성자");
	}
	Sonata(int a) {
		System.out.println("자동차 도어 갯수는 "+a+"개 입니다.");
	}
	Sonata(String str){
		System.out.println("자동차 옵션은"+str+" 입니다.");
	}
}


public class C2_ContrEx {
	
	public static void main(String[] args) {
		
		//기본 생성자 호출
		
		Sonata s = new Sonata();
		Sonata s1 = new Sonata(4);
		Sonata s2 = new Sonata("자동문");
		
		System.out.println(s+","+s1+","+s2);
	}
	
}
