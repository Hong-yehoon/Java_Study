/*
		컬렉션
			. 배열이 가진 고정크기의 단점을 극복하기 위해서 가변크기의 컨테이너로 구현해 놓은 자료구조들이다. 
			. 자바에서는 필요한 자료구조를 미리 구현하여 java.util 패키지에서 자료구조 라이브러리를 
				제공하고 있는데 이를 컬렉션 프레임이라고 한다. 
				
			. 구조
		(인터페이스)					Collection										Map<k,v>
										|												|
					-----------------------------------------							|
					|					|					|							|
				set<E>				List<E>				Queue<E>						|
					|					|					|							|
			-----------			------------				|							|
(클래스)	HashSet<E>				ArrayList<E>			LinkedList<E>				HashMap<k,v>
		TreeSet<E>				Vector<E>											TreeMap<k,v>
								Stack<E>
	
		
			. 주요메소드 
				(Collection 인터페이스)
					- boolean add(E e) 	: 객체추가
					- boolean remove(Object e) : 객체 삭제
					- void clear() : 모든 객체 제거
					- Iterator<E> iterator() : 순환할 반복자를 반환
					- int size() 	: 요소의 개수 반환
					
				(Collection 클래스)
					- sort() : 컬렉션에 포함된 요소들의 정렬
					- reverse() : 요소를 반대순으로 정렬
					- max(), min(): 최대, 최소값 찾아내기
					
				(Map)
					- V push(k key, v Value) : key와 value를 짝으로 map에 추가
					- V get(k key) : key로 값 반환
					- V remove(key): key가 있는 경우 제거
					- boolean isEmpty() : Map이 비어있는지 여부 반환 ---if 문 같이 사용
					- set keyset() : key집합을 Set으로 반환(중복안됨)
					- Collection values() : Value를 Collection으로 반환 (중복허용)
*/
package Collection;

public class Member {

	private int memberId;
	private String memberName;
	
	//초기화
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	//추가

	@Override
	public String toString() {						//가져가서 재정의해서 쓰겠다~~~
		// TODO Auto-generated method stub
		return memberName+"회원님의 아이디는"+memberId+"입니당";
	}
	
}
