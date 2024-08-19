package ex02_Thread;

public class QuizMain {

	public static void main(String[] args) {
		QuizThread2 qt =new QuizThread2();
		qt.start();
		qt.startGame();

	}

}
