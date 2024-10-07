package ex01_buffered;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex07_sum {
	public static void main(String[] args) throws Exception {
		// 문제
		// N개의 숫자가 공백없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하세요.

		// 입력
		// N개의 숫자를 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자의 개수 : ");
		int count = Integer.parseInt(buffer.readLine());

		System.out.print("숫자입력 : ");
		String[] iArr = buffer.readLine().split("");

		int sum = 0;

		if (iArr.length > count || iArr.length < count) {
			System.out.println("설정된 갯수랑 다릅니다.");
		} else {
			for (int i = 0; i < count; i++) {

				sum += Integer.parseInt(iArr[i]);
			}
			System.out.println("결과");
			System.out.println("총합 : " + sum);
		}

		// 출력
		// 입력으로 주어진 숫자 N개의 합을 출력

		// 예시
		// 1
		// 1
		// 결과
		// 1

		// 25
		// 7000000000000000000000000
		// 결과
		// 7

		// 11
		// 10987654321
		// 결과
		// 46

	}

}
