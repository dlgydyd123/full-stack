package ex03_method;

public class Bread {


	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("------------------");
	}

	public void makeBread(int count) {
		for (int i = 0; i < count; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 빵을 만들었습니다.");
		System.out.println("---------------------------------");
	}

	public void makeBread(String type, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(type + "빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count + "개의 " + type + "빵을 만들었습니다.");
	}

}
