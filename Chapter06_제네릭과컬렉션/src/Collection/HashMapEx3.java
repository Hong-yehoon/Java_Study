package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

class Score{
	public int id;
	private int kor, math, eng;
	private String name;
	//메소드
		//. 과목성적 설정하기	void		set(과목)
		//. 과목성적 가져오기	int 		get(과목)	
		//. 학생별 성적 출력하기 	void (출력만하고 끝이니까 )		print()
		//. 총점 구하기		double		getTotal()
		//. 평균구하기		float		getAvg()
	public Score (int id, int kor, int math, int eng) {
		this.id = id;
		this.name = name;
		this.kor =kor;
		this.math=math;
		this.eng=eng;
			
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public double getTotal() {
		return kor+math+eng;
	}
	public float getAvg() {
		return (kor+math+eng)/3;
	}
	void printScore() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class HashMapEx3 {

	public static void main(String[] args) {
		
		HashMap<String, Score> card = new HashMap<>();
		
		//저장
		card.put("김효진", new Score(11, 80, 78, 89));
		card.put("이제욱", new Score(12, 88, 98, 49));
		card.put("김형주", new Score(13, 83, 58, 79));
		card.put("박유정", new Score(14, 80, 73, 99));
		card.put("임택균", new Score(15, 86, 45, 63));
		
		
		Scanner sc = new Scanner(System.in);
		 String key = null;
	     int value = 0;
	    
	     
		while(true) {
			System.out.println("1.학생검색   2.학생등록  3.자료출력   4.학생삭제   5.종료");
			int num = sc.nextInt();
		
		switch(num) {
		
		case 1 : System.out.println("학생이름 입력");
				String info = sc.next();
				Score k = card.get(info);
				if(k == null) {
				System.out.println("찾는 학생 없음"); 
				}else {
				System.out.println(k.getId()+" "+k.getKor()+" "+k.getMath()+" "+k.getEng());
				}break;
		case 2 : System.out.println("등록하려는 학생이름을 입력");
					key = sc.next();
					if(card.containsKey(key)==true) {
	                    System.out.println("이미등록되어있습니다. ");
	                } else {
	                    System.out.print("학번, 국어, 수학,영어 점수 입력. ");
	                    int id = sc.nextInt();
	                    int kor = sc.nextInt();
	                    int math = sc.nextInt();
	                    int eng = sc.nextInt();
	                    card.put(key, new Score(id, kor, math, eng));
	                    
	                    System.out.println("등록 되었습니다.");  
	                    System.out.println("학번 :"+id+" 이름 :"+key+" 국어 :"+kor+" 수학 :"+math+" 영어 :"+eng);   
	                }break;
		case 3 : System.out.println("평균, 총점 원하는 학생 이름 입력");
					
					key = sc.next();
					Score s = card.get(key);
					
					if(card.containsKey(key)==true) {
					System.out.println(key+" 학생의 시험 총점은"+s.getTotal()+", 학생의 시험 평균은"+s.getAvg());
					} else {
						System.out.println("학생자료가 없습니다.");
					}break;
		case 4 : System.out.println("삭제하고 싶은 학생 이름 입력");
					key = sc.next();
					card.remove(key);
					System.out.println("삭제되었습니다.");	break;
						
		case 5 : System.out.println("종료합니다."); 
					break;
			}		
		
	}
}		
}		
