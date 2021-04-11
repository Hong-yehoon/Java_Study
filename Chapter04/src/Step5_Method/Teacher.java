package Step5_Method;

public class Teacher {

	private String name, subject;
	private int age; 
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	void printTc() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("과목: "+subject);
		System.out.println("******************************");
	}
}
