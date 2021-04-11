package Step5_Method;

public class Student1{
	
	private String name;
	private int age;
	private String ban;
	
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
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
	void prinSt() {
		System.out.println("이름: "+name);
		System.out.println(age);
		System.out.println(ban);
		System.out.println("*****************************");
	}
}
