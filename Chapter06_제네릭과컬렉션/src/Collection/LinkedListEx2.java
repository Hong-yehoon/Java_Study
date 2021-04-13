package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx2 {

	static void printList(LinkedList<String> m){
		
		Iterator<String> iterator = m.iterator();
		
		while(iterator.hasNext()) {			//다음 값이 있으면 아래를 실행
			String e = iterator.next();			//값을 읽어서 저장
			String separator;
			
			if(iterator.hasNext()) {		
				separator = "->";			//마지막이 아니면/.
			}else {
				separator = "\n";			//마지막이면 줄을 바꿔라.
			}
				System.out.print(e+separator);
		}
	
	}
	public static void main(String[] args) {
		
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("트랜스포머");
		myList.add("해리포터");
		myList.add("리틀포레스트");
		myList.add(1,"인터스텔라");
		
		Collections.sort(myList);
		printList(myList);
		
		int index = Collections.binarySearch(myList, "해리포터")+1;
		System.out.println("해리포터는"+index+"번째요소입니다.");
	}
}
