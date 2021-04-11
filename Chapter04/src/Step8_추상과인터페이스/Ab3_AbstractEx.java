package Step8_추상과인터페이스;

abstract class DObject{
	public DObject next;
	public DObject() {				//생성자
		next = null;
		System.out.println(next);
	}
	public abstract void draw();		//구현부가 없으니까 abstract
}

abstract class Person extends DObject{
	
	public String name;
	
	public Person (String name) {
		this.name = name;
		System.out.println(name);
	}
	public String getName() {
		return name;
		
	}
	
	@Override
	public void draw() {
		System.out.println("오버라이딩시에 구현되는 메서드의 접근지정자의 범위가 더 넓어야한다.");
		// TODO Auto-generated method stub
		
	}
	//추상메소드 추가
	abstract public void print();
	
}
class Superman extends Person {
	public Superman(String name) {
		super(name);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(super.name+": Dobject의 추상메소드는 Person에서 구현했고,클래스의 추상메소드는 자식superman에서 구현했다/");
	}
}
public class Ab3_AbstractEx {

	public static void main(String[] args) {
		
		DObject obj;			//추상클래스는 객체 생성은 불가능 선언은 가능
	
		Person p;
		p = new Superman("홍길동");		//자식을 부모타입으로, 업캐스팅하면 부모것만 사용할 수 있따. 
		p.draw();		//부모것
		p.print();          //----->abstract public void print();------>@Override public void print() {
		
		
		obj = new Superman("홍ㅇ훈");
		obj.draw();		//오버라이딩된 자식의 draw() 실행
		
		
			
	
	}
		
}
