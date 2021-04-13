package Collection;

import java.util.ArrayList;

class ArrayList1 {
	
	//멤버변수
	private ArrayList <Member> arrayList;
	
	//생성자 - ArrayList 를 생성해서 초기화 하고 있다. 
	public ArrayList1() {
		arrayList = new ArrayList<>();
	}
	
	//멤버 추가
	public void addMemner(Member member) {
		arrayList.add(member);		//ArrayList에 member객체 추가
	}
	//찾는 아이디가 있으면 삭제
	public boolean removeMember ( int memberId) {
		
		for(int i= 0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);		//ArrayList 속에 저장된 member 객체를 꺼내서 변수에 담는다.
			int tempId = member.getMemberId();		//그 꺼내온 member 객체속에서 ID 값을 꺼내서 tempId에 저장
			
			if(tempId == memberId) {		//찾는 아이디가 있으면
				arrayList.remove(i);		//그 값을 지우고
				return true;
			}
		}
		System.out.println(memberId+"는 존재하지 않습니다.");
		return false;
	}
	//전체 회원카드 출력
	public void showAllMember() {
		for(Member m : arrayList) {			//꺼내온 변수를 담아
			System.out.println(m);
		}System.out.println();
	}
}

public class C2_ArrayListEx2 {

	public static void main(String[] args) {
		
		//회원 멤버 객체생성
		Member hong = new Member(1001,"홍예훈");
		Member kim = new Member(1002, "김효진");
		Member park = new Member(1003, "박유정");
		
		//만든 회원카드를 ArrayList에 담아보쟝
		ArrayList1 mlist = new ArrayList1();		// 여기 순간, ArrayList<Member> 생성
		
		mlist.addMemner(hong);
		mlist.addMemner(kim);
		mlist.addMemner(park);
		
		//회원전체 명부 출력
		mlist.showAllMember();
		
		//회원 삭제
		mlist.removeMember(1002);
		
		//삭제확인
		mlist.showAllMember();
		
	
	}
	
	
	
	
}
