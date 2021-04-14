/*
		직렬화와 역직렬화
			. 객체가 생성된 후 객체의 변수값은 생명체처럼 지속 변경된다. 
			. 객체가 생성된 후 어느 순간 그대로 저장하거나 네트워크를 통해 어느시점의 데이트를 전송하는 것을 말한다. 
			
			. 객체 내용을 연속스트림으로 만드는 것을 말한다.
			 	이렇게 만들어야 파일에도 쓸 수 있고 네트워크로 전송도 할 수있다. 
			 	
			. 문법 구조
					(임의의 자료구조 클래스 생성)
						. serialversionUTD생성
					
					(출력) - 직렬화
						1) (기반스트림) FileOutStream 으로 저장할 파일을 생성한다.
						2) (보조스트림) ObjectOutStream 으로 Object형으로 출력시킨다. 
							   |
						 출력(저장, 전송)
						 	   |
						 	   
					(입력) - 역직렬화
							. serialversionUTD를 확인하고 변경되었으면 에러발생
						1) (기반 스트림) FileInputStream 으로 읽어올 파일의 객체를 생성한다. 
						2) (보조 스트림)  ObjectOutStream으로 Object형으로 읽어오고 이떄, 
									데이터의 해당 클래스 타입으로 형변환 하여 객체를 생성활용한다. 
						
					
*/
package 직렬화;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	
	String name, job;
	
	public Person(){}
			
	public Person(String name, String job) {
		this.job = job;
		this.name = name;		
	}
	public String toString() {
		return name +" ,"+job;
	}
}
public class SerializationEx1 {
	public static void main(String[] args) {
		
		Person Ahn = new Person("안재용", "대표이사");
		Person Kim = new Person("김철수", "상무이사");
		
		//직렬화
		
		try {
			FileOutputStream fos = new FileOutputStream(".\\file\\serializaion1.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(Ahn);
			oos.writeObject(Kim);
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		//역직렬화
		try {
			FileInputStream fis = new FileInputStream(".\\file\\serializaion1.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			
		}
		
}
}