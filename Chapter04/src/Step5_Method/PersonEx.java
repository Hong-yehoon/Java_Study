package Step5_Method;

public class PersonEx {
	public static void main(String[] args) {
		
		Student1 st1 = new Student1();
		st1.setName("선원");
		st1.setAge(27);
		st1.setBan("1");
		System.out.println("학생이름:"+st1.getName());
		
		Teacher tc1 = new Teacher();
		tc1.setName("홍예훈");
		tc1.setAge(26);
		tc1.setSubject("java");
		System.out.println(tc1.getName());
		
		
		Manager mg1 = new Manager();
		mg1.setName("효진");
		mg1.setAge(25);
		mg1.setPart("커피마시기");
		mg1.printMg();
	
	
	}
	
}
