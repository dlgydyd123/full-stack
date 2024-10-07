package ex03_array;

import java.util.Scanner;

public class Ex10_multi_array {

	public static void main(String[] args) {
		// 1~25까지 2차원배열 arr에 순차적으로 넣고
		// 한줄에 다섯개씩 출력하기

		int[][] arr = new int[5][5];

		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%02d ", (arr[i][j] = count++));
			}
			System.out.println();
		}

		System.out.println("---------------------------------------");
		// 로또번호 맞추기
		int[][] lotto = { { 2, 1, 11, 33, 42, 44 }, 
						{ 1, 6, 17, 22, 24, 33 }, 
						{ 7, 16, 24, 33, 45, 9 },
						{ 27, 42, 35, 21, 43 }, 
						{ 6, 17, 22, 24, 33, 41 } };

		// 키보드에서 당첨숫자를 연속으로 6개 입력받아 myNum에 넣는다.
		String myNum = "";
		boolean isWin = false;

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 6; i++) {
			System.out.printf("%d번째 숫자를 입력해주세요 : ", i);
			myNum += scan.nextInt();
		}

		for (int i = 0; i < lotto.length; i++) {
			String lottoNum = "";
			for (int j = 0; j < lotto[i].length; j++) {
				lottoNum += lotto[i][j];
			}
			if (myNum.equals(lottoNum)) {
				isWin = true;
				break;
			}
		}

		if (isWin) {
			System.out.println(myNum + "번호당첨");
		} else {
			System.out.println(myNum + "번호는 당첨되지 못했습니다.");
		}

		// 2차원배열에 들어있는 1차원배열 5개중 하나라도 완전히 일치하는
		// 곳이 있으면 당첨!, 아니면 당첨되지 못했습니다 출력하기
		// myNum.equals

	}

}
