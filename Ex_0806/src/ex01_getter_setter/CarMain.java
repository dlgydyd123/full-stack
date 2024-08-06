package ex01_getter_setter;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();

		// 잘못된 속도변경
		c.setSpeed(-50);

		System.out.println("현재 속도 : " + c.getSpeed());

		// 올바른 속도 변경
		c.setSpeed(60);

		System.out.println("현재 속도 : " + c.getSpeed());
		
		//멈춤
		if(!c.getStop()) {
			c.setStop(true);
		}
		
		System.out.println("현재 속도 : " + c.getSpeed());

	}

}
