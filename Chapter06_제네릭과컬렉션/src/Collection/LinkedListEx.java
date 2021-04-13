/*
		LinkedList
		
					배열 							LinkedList
	-----------------------------------------------------------------
	저장 		믈리적 연속 공간						논리적 연속 공간
	삽입/삭제	크기 변하면 다시 만들어야함				앞 뒤 노드의 연결주소만 변경
	장단점	자료변경이 거의 없을 때					자료변경이 많을 때
	
		. 주요 메소드
			- add(), add(index,value), addFirst(value), addList(value)
			- get(index), getFirst(), getLast()
			- remove(index), removeAll(), removeFirst(), removeLast()

*/
package Collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		
		LinkedList<String> link = new LinkedList<>();
		
		link.add("A");
		link.add("B");
		link.add("C");			//끝에 무조건 삽입
		
		System.out.println(link);
		link.add(1, "d");
		link.add(1, "e");
		System.out.println(link);
		
		link.addFirst("0");
		link.addLast("Z");
		System.out.println(link);
	
		//1번째 값 출력
		
		System.out.println(link.get(0));
		//마지막값 
		System.out.println(link.getLast());
		//3번 값 삭제
		link.remove(2);
		System.out.println(link);
	}
}
