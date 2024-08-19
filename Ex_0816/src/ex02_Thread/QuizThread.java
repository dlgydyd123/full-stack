package ex02_Thread;

import java.util.Scanner;

public class QuizThread extends Thread {

	Scanner scan = new Scanner(System.in);
	int count = 0;
	public void startGame() {
		int startTime = (int) System.currentTimeMillis();
		 while (true) {
			int num1 = (int) (Math.random() * 100 + 1);
			int num2 = (int) (Math.random() * 100 + 1);
			System.out.print(num1 + " + " + num2 + " = ");
			 try {
				int result = scan.nextInt();
				if (num1 + num2 == result) {
					System.out.println("정답!!");
					count++;
				} else {
					System.out.println("오답");
				}

				if (count == 5) {
					break;
				}
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요.");
				scan.next();
			}

		}
		int endTime = (int) System.currentTimeMillis();
		int time = (endTime - startTime)/1000;
		System.out.println("걸린 시간 : " + time+"초...");
	}

	@Override
	public void run() {
		
	
	}
}
