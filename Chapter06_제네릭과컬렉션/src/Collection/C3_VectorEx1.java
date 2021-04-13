package Collection;

import java.util.Vector;

public class C3_VectorEx1 {

	public static void main(String[] args) {
		
		//벡터생성
		Vector<Integer> v = new Vector<>();
		
		//자료입력
		v.add(5); 
		v.add(4);
		v.add(-1);
		
		
		//벡터의 중간에 삽입하기
		v.add(2, 100); 			//두번째에 100을 넣겠다~~~~
		
		//출력해보자
		for(int i = 0; i<v.size(); i++ ) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		System.out.println("벡터내의 요소 객체의 수: "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		
		//벡터의 모든 정수를 더하시오./
		int sum = 0;
		for(int i = 0; i<v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
				
		//벡터속의 총합을 출력하시오
		System.out.println("백터 안에 있는 정수의 합: "+sum);
		
		//*****************************************************
		Vector<Member> m = new Vector<>();
		
		
		//Member t = new Member(100, "김효진멍챙이");
		//m.add(t);
		
		Member t = new Member(sum, null);
		m.add(new Member(1001, "김효진"));
	
		t.setMemberId(45613);
		System.out.println(t.getMemberId());
		t.setMemberName("박유정");
		System.out.println(t.getMemberName());
		
		//출력 size / 꺼낼 때 get/ 집어넣을때 add
	}
}
