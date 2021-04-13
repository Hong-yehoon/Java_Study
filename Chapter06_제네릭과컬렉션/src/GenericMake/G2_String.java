package GenericMake;
//일반적인 클래스이고 문자를 받아서 스택에 저장하고 꺼내 사용하는 스택클래스이다. 

class GStack1 {
	int point;
	Object [] stack; 			//최상위 object의 객체를 담는 배열 stack선언
	
	public GStack1() {			//초기화
		point = 0;		
		stack = new Object[10];		//최상위 object의 객체를 담는 배열 stack생성
		
	}
	public void push(String item) {

		if(point==10) {			//배열이 꽉 차있으면
			return;				//호출한 곳으로 그냥 돌아가라.
		}
		
		stack[point] = item;	//저장해랑  = new String(item);  부모것으로 형변환
		point ++;				//저장하고 포인트를 증가 시킨다.
	}
	
	public String pop() {
		if (point ==0) {
			return null;
		}
		//값이 있으면, 포인트를 하나 내려놓고, 값을 리턴해라.
		point --;
		return (String)stack[point];  //업캐스팅 상채 --> 다운캐스팅해서 반환(명시적)
	}
}
public class G2_String {

	public static void main(String[] args) {
		
		GStack1 st = new GStack1();
		
		st.push("서울");
		st.push("부산");
		st.push("광주");
		st.push("대구");
		
		for(int n=0; n<4; n++) {
			System.out.println(st.pop());
		}
	}
}






