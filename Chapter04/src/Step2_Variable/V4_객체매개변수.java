package Step2_Variable;

class Data{
	
	int kor;
	int eng;
	
	void add(Data d1, Data d2) {
		
		d1.kor = d2.eng;
		System.out.println("d1: "+d1);
		
	}
}


//실행클래스
public class V4_객체매개변수 {
	public static void main(String[] args) {
	
		Data d1 = new Data();  //객체 생성
		Data d2 = new Data();
		Data d3 = new Data();
		
		//초기화
		d1.kor = 70;
		d2.eng = 80;
		d3.add(d1, d2); 		// d1과 d2는 객체 주소값을 가지고 있다. 
		
		System.out.println(d1);
		System.out.println(d2);
		
		System.out.println("d3 값은"+d3);
		System.out.println("메인 국어 점수: "+d1.kor);
		
	}
}
