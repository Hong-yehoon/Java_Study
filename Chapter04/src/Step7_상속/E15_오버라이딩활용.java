package Step7_상속;

class Person2 {
	private String name;
	private int age;
	
	Person2(){}
		Person2(String name, int age){
			this.name = name;
			this.age = age;
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
	public void print() {
		System.out.println("----------------");
		System.out.println("이름: "+name);
		System.out.println("나이: "+age); 
	}
}

class Student2 extends Person2 {
	private String sno;
	
	
	
	public Student2(String name, int age, String sno) {
		super(name,age);
		this.sno=sno;
		
	}
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
	public void print() {
		super.print();
		System.out.println("학번: "+sno);
	}
}
class Teacher2 extends Person2 {
	private String subject;
	public Teacher2(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//추가
	public void print() {
		super.print();
		System.out.println("과목: "+subject);
	}
}
class Manager2 extends Person2 {
	private String part;
	Manager2(){
		
	}
	public Manager2(String name, int age, String part) {
		super(name,age);
		this.part=part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	//c추가 
	public void print() {
		super.print();
		System.out.println("담당: "+part);
	}
}
public class E15_오버라이딩활용 {
	
	public static void main(String[] args) {
		//배열 생성
		Person2 [] ps = new Person2[5];
		
		ps[0] = new Student2("박유정",10,"맥도날드");
		ps[1] = new Teacher2("박인희",22,"버거킹");
		ps[2] = new Manager2("전혜빈",20,"KFC");
		ps[3] = new Student2("김효진",25,"빅맥");
		ps[4] = new Student2("홍예훈",26,"와퍼");
		
		for(Person2 p: ps) {
			
			p.print();		//오버라이딩된 자식의 print()가 실행된다.
			
			if(p instanceof Manager2) {		//만약에 매니저 소속이라면.....
				Manager2 m = (Manager2)p;
				m.getPart();
			}
		}			
				
	}
}
