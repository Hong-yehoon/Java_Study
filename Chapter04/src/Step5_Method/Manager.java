package Step5_Method;

public class Manager {
	
	private String name, part;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age;
	
	
	//추가한 메소드
	void printMg() {
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println(part);
		System.out.println("*****************************");
	}
}
