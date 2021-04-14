package 직렬화;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//도면을 담을 배열
class Parr implements Serializable{

	private static final long serialVersionUID = -2261449786581744847L;
	Person2[] arr;
	Parr(){
		arr = new Person2[5];
	}
	
	
}
//자료구조 도면클래스
class Person2 implements Serializable{
	
	private static final long serialVersionUID = 886966506812795403L;
	private String name;
	private String age;
	private String address;

	public Person2 (String name, String age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Person2() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class SerializationEx3 {

	public static void main(String[] args) throws ClassNotFoundException{
		
		//도면 클래스 객체생성
		Person2 p1 = new Person2();
		p1.setName("홍길동");
		p1.setAge("30");
		p1.setAddress("서울");
		
		Person2  p2 = new Person2("슈퍼맨", "25", "워싱턴");
		Person2 p3 = new Person2("김효진", "24", "호주");
		
		//배열제 저장
		Parr p = new Parr();		//Person 2 를 저장하는 배열 5개짜리 생성
		p.arr[0] = p1;
		p.arr[1] = p2;
		p.arr[2] = p3;
		p.arr[3] = new Person2("이제욱", "14", "파주");
		p.arr[4] = new Person2("홍예훈", "26", "신도림");
	
		//직렬화
		try {
			FileOutputStream fio = new FileOutputStream(".\\file\\serialization3.out");
			ObjectOutputStream objout = new ObjectOutputStream(fio);
			
			//저장
			objout.writeObject(p);
			System.out.println("정상적으로 저장되었습니다. ");

		} catch(IOException e ) {
			e.printStackTrace();
		}
	
	
	}
	
}
