package Step7_상속;

class A3{
	A3(){
		System.out.println("생성자A");
	}
}
class B3 extends A3 {
	B3(){
		System.out.println("생성자B");
	}
	B3(int x){
		System.out.println("매개변수 있는 생성자1"); 
	}
}

class C3 extends B3 {
	C3(){
		System.out.println("생성자C");
	}
	C3(int x){
		System.out.println("매개변수 있는 생성자 2");
	}
	void print() {
		System.out.println("생성자 우선순위에 대해서 학습");
	}
}
public class E4_상속자우선순위 {

		public static void main(String[] args) {
			C3 obj1 = new C3();
			C3 obj2 = new C3(3);
			
		}
}
