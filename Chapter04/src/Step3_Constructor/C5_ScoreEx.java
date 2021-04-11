package Step3_Constructor;

class Score {
	//멤버 변수 : 이름, 국어(kor), 영어(eng),수학(math) 점수
	String name;
	int kor, eng, math;
	
	
	
	//생성자 : 위에 멤버변수 값을 매개 변수로 받아서 초기화
	public Score(String name, int kor, int eng, int math) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	}
	//print메소드 : 총점을 계산한다. 평균을 계산한다. 국어,영어,수학, 총점, 평균
	void print() {
		int sum = kor+eng+math;
		float avg = (kor+eng+math)/3;
		
		System.out.println(name+"의 국영수 성적");
		System.out.println("국어: "+kor+" 영어: "+eng+" 수학: "+math);
		System.out.println("----------------------------------");//줄바꿈
		
		System.out.println(name+"의 총점: "+sum);
		System.out.println(name+"의 평균: "+avg);
		System.out.println();
	}
}
public class C5_ScoreEx {

	public static void main(String[] args) {
		
	
	//홍길동의 78,88,97점 객체 sc1을 생성한다.
	Score sc1 = new Score("홍길동",78,88,97);
	//이순신의 88,98,96점 객체 sc2를 생성한다.
	Score sc2 = new Score("이순신",88,98,96);
	//sc1과 sc2의 성적 내역을 출력한다.
	
	sc1.print();
	sc2.print();
	}
	
	
}
