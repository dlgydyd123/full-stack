package ex03_method;

public class Start {
	int count = 0;
	int a = (int) ((Math.random() * 50) + 1);

	String upDown(int num) {
		count++;
		if (num > a) {
			return "Down!";
		} else if (num < a) {
			return "Up!";
		} else {
			return "정답 " + count + "번째에 맞추셨습니다.";
		}
	}
}
