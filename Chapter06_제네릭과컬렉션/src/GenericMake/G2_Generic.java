package GenericMake;

class GStack3 <T> {
	
	int point;
	Object [] stack; 			//최상위 object의 객체를 담는 배열 stack선언
	
	public GStack3() {			//초기화
		point = 0;		
		stack = new Object[10];		//최상위 object의 객체를 담는 배열 stack생성
		
	}
	public void push(T item) {

		if(point==10) {			//배열이 꽉 차있으면
			return;				//호출한 곳으로 그냥 돌아가라.
		}
		
		stack[point] = item;	//저장해랑  = new Integer(item);  부모것으로 형변환
		point ++;				//저장하고 포인트를 증가 시킨다.
	}
	
	public T pop() {
		if (point ==0) {
			return null;
		}
		//값이 있으면, 포인트를 하나 내려놓고, 값을 리턴해라.
		point --;
		return (T)stack[point];  //업캐스팅 상채 --> 다운캐스팅해서 반환(명시적)
	}
}
public class G2_Generic {

	public static void main(String[] args) {
		
		//제네릭의 구체화 - 객체생성시에 타입을 결정해서 생성
		GStack3<Integer> st3 = new GStack3();		
		
		st3.push(1);
		st3.push(2);
		st3.push(3);
		st3.push(4);
		
		for(int n=0; n<4; n++) {
			System.out.println(st3.pop());
		}
	
		//문자열
		GStack3<String> st4 = new GStack3();		
		
		st4.push("샐");
		st4.push("러");
		st4.push("드");
		st4.push("먹");
		st4.push("자");
		
		for(int n=0; n<5; n++) {
			System.out.print(st4.pop());
	}
	}
}
