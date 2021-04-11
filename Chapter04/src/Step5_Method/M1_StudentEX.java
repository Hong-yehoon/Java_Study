package Step5_Method;

import java.util.Scanner;


class Student {
	
	// 학생 이름, 국어, 영어, 수학
	String name;
	int kor, eng, math;
	
	// 생성자로 초기화
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 총점 구하기 메소드
	int getTotal() {
		return kor+eng+math;
	}
	// 평균 구하기
	float getAvg() { 
		return(kor+eng+math)/3.0f;
	
	}
	// 내역 출력	
		void print() {
			System.out.printf("%s,%d,%.1f \n",name,getTotal(),getAvg());
		}
	
 }


public class M1_StudentEX {
	 
	public static void main(String[] args) {
		/*Student s = new Student("홍예훈", 98, 94, 92);
		
		System.out.println(s.name+s.eng);
		System.out.println(s.getAvg());
		System.out.println(s.getTotal());
		s.print();*/
		
		//배열 만들고
		
		Student []s = new Student[10];
		
		Student st1 = new Student("홍길동", 45, 86, 78);		//객체 변수생성해 저장
		s[0]=st1;
		
		s[1]= new Student("홍예훈", 86, 75, 88);		//객체 생성해 직접 저장
		s[1].getTotal();
		
		System.out.println("이름, 국어, 수학, 영어 점수를 입력");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		System.out.println(name+"님의 총점은");
		System.out.println(s[0].getAvg());
		
		
	}
}
