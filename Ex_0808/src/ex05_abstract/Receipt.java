package ex05_abstract;

public abstract class Receipt {

	// 필드
	String chef;

	public Receipt(String chef) {
		this.chef = chef;
	}

	void info() {
		System.out.println("이 레시피는 " + chef + "님의 레시피 입니다.");
	}

}
