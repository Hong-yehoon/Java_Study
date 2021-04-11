package Step5_Method;

class Account1{
	
	String accountNo, ownerName;
	int balance;
	
	Account1(String an, String on, int bal){
		accountNo=an;
		ownerName=on;
		balance=bal;
		
	}
	void deposit(int amt) {
		balance += amt;
		
	}
	void withdraw(int amt) {
		if(balance > amt) {
			balance -= amt;
		}else {
			System.out.println("잔액 부족");
			
		}
	}
	/*void withdraw() {
		balance -=1000;			//천원 출금
	}*/
	int getBal() {
		return balance;
	}
	
}

public class M3_AccountEx {
	public static void main(String[] args) {
		
		Account1 ac1 =new Account1("1111", "효진", 1000);
		Account1 ac2 = new Account1("2222","예훈",20000);
		Account1 ac3 = new Account1("222233","유정",30000);
		
		//입금 처리
		ac1.deposit(5000);
		System.out.println(ac1.ownerName+"님의 잔액은"+ac1.getBal());
		
		//출금처리
		ac2.withdraw(3000);
		System.out.println(ac2.ownerName+"님의 잔액은"+ac2.getBal());
		
		ac3.withdraw(50000);/*
		System.out.println(ac3.ownerName+"님의 잔액은"+ac3.getBal());*/
	}
}
