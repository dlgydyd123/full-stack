package ex04_generic;

import java.util.ArrayList;
import java.util.List;

interface Readable{}
interface Closeable{}

class BoxType implements Readable,Closeable{}
class Box<T extends Readable&Closeable>{
	List<T> list = new ArrayList<>();
	
	public void add (T item) {
		list.add(item);
	}
}

public class Ex03_Generic {
	public static void main(String[] args) {
		//Readable과 Closeable를 동시에 구현한 클래스만이 타입할당이 가능하다.
		Box<BoxType> box = new Box<>();
		
		//심지어 최상위 클래스인 Object도 쓸 수 없다.
		//Box<Object> box2 = new Box<>();
		
	}
}
