package ex02_control;

public class Ex01_continue {

	public static void main(String[] args) {
		// continue
		// 반복문 안에서 continue를 만나게 되면 이후의 코드는
		// 수행되지 않고, 반목문의 처음으로 돌아가 진행하게 된다.
		// for문의 경우 증감식으로 이동하며
		// while과 do-while의 경우 조건식으로 이동한다.

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				continue;
			}
			sum += i;
		}

		System.out.println("홀수의 합 : " + sum);

	}

}
