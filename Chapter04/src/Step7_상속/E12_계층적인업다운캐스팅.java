package Step7_상속;
class Person1 {
}
class Student1 extends Person1{	
}
class Researchcer extends Person1{	
}
class Professor extends Researchcer{
}
public class E12_계층적인업다운캐스팅 {
	public static void main(String[] args) {
		Person1 jee = new Person1();
		Person1 kim = new Student1();
		Person1 lee = new Researchcer();
		Person1 jeong = new Professor();
		
		if (jee instanceof Person1) {
			System.out.println("jee는 Person타입으로 true입니다.");
		}
		if (kim instanceof Student1) {
			System.out.println("kim는 Student1타입으로 true입니다.");
		}
		if (lee instanceof Researchcer) {
			System.out.println("lee는 Researchcer타입으로 true입니다.");
		}
		if (jeong instanceof Student1) {
			System.out.println("jeong는 Professor타입으로 true입니다.");
		}else if(jeong instanceof Researchcer) {
			System.out.println("jeong는 Researcher타입이지 Student 타입이 아닙니다.");
		}
	}
}
