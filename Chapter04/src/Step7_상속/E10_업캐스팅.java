/*
		업캐스팅(Upcastig) 다운스캐팅(Downcasting)
		
			- 업캐스팅 : 서브클래스는 슈퍼클래스의 모든 특성을 상속받는다. 
						따라서 서브클래스는 슈퍼클래스로 취급될 수 있다. (예, 사망을 생물이라고 불러도 된다.)
						
						서브클래스 객체가 슈퍼 클래스 타입으로 변환되는 것을 업캐스팅이라고 한다. 
							* 선언된 래퍼런스는 부모객체의 멤버변수만 접근 가능하다. 자식 멤버 변수 접근 시 컴파일러에러 발생
							* 
			- 다운캐스팅 : 업케스팅된 서브 클래스 객체는 영원히 자신의 고유 특성을 잃어버리는 것은 아니다. 
			
					업캐스팅된 것을 다시 원래대로 되돌리는 것을 다운캐스팅이라고 한다. 
					다운캐스팅은 업캐스팅과 다르게 명시적으로 타입을 지정해야한다. 
*/
package Step7_상속;

class Person {
		String name, id;
		public Person(String name) {
			this.name = name;
		}
		
}
class Student extends Person{
	String grade;
	public Student(String name) {
		super(name);
	}
	void print() {
		System.out.println("자식 프린트메소드");
	}
}
public class E10_업캐스팅 {
		public static void main(String[] args) {
	
			
			//자식객체생성
			Student s = new Student("홍예훈");
			s.grade="A";							//자식멤버 접근
			System.out.println(s.grade);
			s.print();								//자ㅣㅅㄱ메소드 접근
			
			
			System.out.println(s.name);
			s.id = "뿡뿡이";
			System.out.println(s.id);
			
			
			//업캐스팅		- 묵시적으로 형변환
			Person p = new Student("전혜빈");    //Student s = new Student("전혜빈");
			//p.grade="B";		자식의 멤버변수 안ehla
			//p.print();		자식의 멤버메소드 안됨
			
			System.out.println(p.name);
			p.id="배고파ㅣ";
			System.out.println(p.id);
			
			//다운캐스팅	- 명시적으로 형변환
			Student t = (Student)p;
			
			t.grade="B";
			t.print();
			System.out.println(t.name);
		}
		
}
