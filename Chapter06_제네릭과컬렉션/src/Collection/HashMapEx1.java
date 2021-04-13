/*
	HashMap<k,v>
		; 키와 쌍으로 구성되는 요소를 다룬다.
		ex) 사번,이름	 단어 ,뜻	키,객체
		
		- 주요메소드
			. put(k,v)		: 해시맵에 저장
			. get(k)		: 지정된 키의 값(value), 없으면 null 리턴
			. remove(k) 	: 삭제
			. isEmpty()		: 해시맵이 비어있으면 true 리턴
			. clear()		: 모두삭제
			. containsKey	: 지정된 값이 존재하면 return
			. containsValue(v) :지정된 값이 존재하면 true 리턴 
			. size() :

*/
package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {

	public static void main(String[] args) {
		
		//해시맵 생성(키단어 값단어)
		HashMap<String, String> dic = new HashMap<>();
		
		//3개의 키는 영단어, 값은 한글단어
		dic.put("Apple","사과");
		dic.put("Baby", "효진");
		dic.put("Good", "굿굿");
		dic.put("Love", "싸랑");
		dic.put("임택균", "지각");
		
		//검색 'q'를 입력받으면 종료
		Scanner sc = new Scanner(System.in);
			while (true) {
				System.out.println("찾고 싶은 단어(종료하고 싶으면q)");
				String word = sc.next();
				
				if(word.equals("q")) {
					System.out.println("종료합니다.");
					break;
				}
				String kor = dic.get(word);
				if(kor == null) {
					System.out.println(word+"단어는 없습니다.");
				}else {
					System.out.println(kor);
				}
			}
		sc.close();
		
		
	}
}
