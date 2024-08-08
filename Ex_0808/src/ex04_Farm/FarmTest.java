package ex04_Farm;

class Animal {
	public void cry() {

	}
}

class Pig extends Animal {
	
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}

class Cow extends Animal {
	
	@Override
	public void cry() {
		System.out.println("음메");
	}
}

class Farm {
	public void sound(Animal animal) {
//		if(animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		}else {
//			System.out.println("음메");
//		}
		animal.cry();
	}

}

public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}

}

//instanceof 와 '=='의 차이
//A instanceof B : 객체변수 A가 B타입으로 생성된 것인지 확인
//A == B  : 객체A와 객체B가 같은 주소를 참조하고 있는지 확인
