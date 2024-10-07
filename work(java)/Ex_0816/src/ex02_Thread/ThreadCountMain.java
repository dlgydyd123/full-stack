package ex02_Thread;

import java.util.Scanner;

public class ThreadCountMain {
	// 스캐너를 통해 숫자를 입력받고
	// 스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을 때
	// "종료"라는 메시지와 함께 스레드 종료
	// ThreadCount클래스에 스레드 정의하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("횟수를 입력하세요 : ");
		int count = scan.nextInt();
		ThreadCount tc = new ThreadCount(count);

		tc.start();

	}
}
