package Collection;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private int id;
	
	public Student (int id, String name, int age) {
		this.id = id;
		this.name=name;
		this.age=age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
public class HashMapEx2 {
	
	public static void main(String[] args) {
		
		HashMap<String,Student> card = new HashMap<>();
	
		//저장
		card.put("홍길동", new Student(1, "홍길동", 25));
		card.put("알리오오일파스타", new Student(2, "김효진", 24));
	
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("찾고 싶은 단어(종료하고 싶으면exit)");
			String word = sc.next();
			
			if(word.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			Student kor = card.get(word);
			if(kor == null) {
				System.out.println(word+"단어는 없습니다.");
			}else {
				System.out.println(kor.getId()+kor.getName()+kor.getAge());
			}
		}
	sc.close();
	}
	
}
