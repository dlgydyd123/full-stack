package ex02_for;

import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("------------------");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		for (int i = 1; i <= 20; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		int dan = 7;
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " x " + i + " = " + (dan * i));
		}

		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = scan.nextInt();
		int sum2 = 0;
		for (int i = 1; i <= num; i++) {
			sum2 += i;
		}
		System.out.println("총합 : " + sum2);

//		int count = 0;
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + "번째 정수를 입력해 주세요 : ");
//			int number = scan.nextInt();
//			if (number % 2 == 0) {
//				count += 1;
//			}
//		}
//		System.out.println("입력받은 숫자 중 짝수는 " + count + "개 입니다.");

		System.out.print("첫번째 정수를 입력해주세요:");
		int x = scan.nextInt();
		System.out.print("두번째 정수를 입력해주세요:");
		int y = scan.nextInt();

//		int sum3 = 0;
//		if (x > y) {
//			for (int i = y; i <= x; i++) {
//				sum3 += i;
//			}
//		System.out.printf("%d부터 %d까지의 총합 : %d ", y, x, sum3);
//		} else {
//			for (int i = x; i <= y; i++) {
//				sum3 += i;
//			}
//		System.out.printf("%d부터 %d까지의 총합 : %d ", x, y, sum3);
//		}
//		

		if (x > y) {
			int z = x;
			x = y;
			y = z;
		}
		int sum4 = 0;
		for (int i = x; i <= y; i++) {
			sum4 += i;
		}
		System.out.printf("%d부터 %d까지의 총합 : %d ", x, y, sum4);

	}

}
