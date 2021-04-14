package 직렬화;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx3_역직렬화 {
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			
			FileInputStream fin = new FileInputStream(".\\file\\serialization3.out");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			Parr pin = (Parr)objin.readObject();
			
			//객체속에 있는 배열
			for(int i = 0; i<pin.arr.length; i++) {
				if(pin.arr[i] ==null) {
					break;
				}else {
					System.out.print(pin.arr[i].getName());
					System.out.print(pin.arr[i].getAge());
					System.out.print(pin.arr[i].getAddress());
					System.out.println();
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace(); 
			// TODO: handle exception
		}
	}
}
