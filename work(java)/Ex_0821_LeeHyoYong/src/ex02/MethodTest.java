package ex02;

import java.util.Scanner;

public class MethodTest {

	void maxFider(int arr[]) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
	}

	Scanner scan = new Scanner(System.in);
	double tem = 0;

	void fToc() {
		System.out.print("섭씨를 입력해주세요 : ");
		tem = scan.nextDouble();
		System.out.println((1.8 * tem + 32) + "C");
	}

	void cTof() {
		System.out.print("화씨를 입력해주세요 : ");
		tem = scan.nextDouble();
		System.out.println(((tem - 32) / 1.8) + "F");
	}

}
