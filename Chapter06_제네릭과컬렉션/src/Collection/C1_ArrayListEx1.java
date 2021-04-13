/*
	ArrayList
		. add(E e)	: 맨끝에 객체 추가
		. add(int index, E e) : 해당 인덱스에 객체 추가
		. void clear() : 벡터의 모든 요소 삭제
		. elementAT(int index) : 인덱스 요소 리턴
		. contains(Object e) : 지정된 객체를 포함하고 있으면 true리턴
		. get(int index)	 : 인덱스 요소 리턴
		. indexOf(Object obj) : obj와 같은 첫번째 요소의 인덱스 리턴, 없으면 -1값 리턴
		. isEmpty() : 벡터가 비어 있으면 true 리턴
		. remove(int index) : 인덱스의 요소 제거
		. removeAllElements() : 모든요소를 삭제하고 크기를 0으로 만듦
		. size() : 벡터 요소갯수 리턴


*/

package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class C1_ArrayListEx1 {

	public static void main(String[] args) {
		
		//ArrayList 생성  배열 생성하듯이
		ArrayList<String> a = new ArrayList<>();					//제네릭 클래스
		
		//키보드로부터 4개의 이름을 받아서 삽입
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			System.out.println("이름을 입력해 주세여ㅛ");
			String s = sc.next();
			a.add(s);							//add method : 값(요소)를 추가한다.
		}
		//출력
		for(int i=0; i<a.size(); i++) {				//size!!
			String name = a.get(i);				//get() : 값(요소)을 꺼내온다.
			System.out.println(name+" ");
		}
			//가장 긴 이름을 출력하시오.
		int longest = 0;
		//가장 긴 이름 찾아내기
		for(int i = 1; i<a.size(); i++) {
			if(a.get(longest).length() < a.get(i).length()) {

			longest = i; //긴것으로 인덱스를 교체
		}
	}
		System.out.println("가장 긴 이름은 "+a.get(longest));
		sc.close();
	}
}
