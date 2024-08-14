package ex04_generic;

interface Person{
	
}

class Student implements Person{
	
}

class Worker{
	
}

//Person인터페이스를 구현한 클래스만 제네릭타입으로 들어올 수 있다. 
class School<T extends Person>{
	
}

public class Ex02_Generic {
	public static void main(String[] args) {
		//Worker클래스가 Person인터페이스를 구현하지 않았기 때문에 불가능
		//School<Worker> s = new School<>();
		School<Student> s2 = new School<>();
	}
}
