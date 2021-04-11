package Step5_Method;

class Account{
	String accountNo, ownerName;
	int balance;
	
	//예금
	void deposit() {
		balance =+ 1000;
	}
	//출금
	void whithdraw() {
		balance =+ 1000;
	}
	//잔액
	int getBal() {
		return balance;
	}
}

public class M2_입출금 {

	public static void main(String[] args) {
		
		Account ac = new Account();   //위 도면 클래스에 생성자 안쓰면 컴파일러가 기본 생성자 만들어줌
		ac.accountNo ="1111";
		ac.ownerName="홍길덩";
		ac.balance=10000;
		
		System.out.println("처음잔액"+ac.getBal());
		
		//1000원씩 3번 입금
		for(int i=0; i<3; i++) {
			ac.deposit();
		}
		//1000원씩 3번 출금;
		for(int i=0; i<2; i++) {
			ac.whithdraw();
		}
		
		System.out.println("예금주:"+ac.ownerName);
		System.out.println("ㄱㅖ좌번호"+ac.accountNo);
		System.out.println("잔액"+ac.getBal());
	}
	
}
