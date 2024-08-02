package ex02_control;

import java.util.Scanner;

public class Ex02_break {

	public static void main(String[] args) {
		// break문은 이전에 switch문을 학습할 때 case문을 종료할 때 사용되었다.
		// break라는 단어의 의미과 동일하게 반복문을 미리 종료할 때 사용한다.
		// 반복문이 진행되는 도중, 특정 조건을 만족해 더 이상 반복문을
		// 실행할 필요 없이 종료하려고 할 때 사용

		// 난수의 생성
		// 1. Random 클래스
		// 2. Math 클래스 (java.lang패키지에 있는 클래스)
		// Math클래스가 static으로 정의되어있기 때문이다.
//		int magicNumber = (int) (Math.random() * 50) + 1;
//
//		Scanner scan = new Scanner(System.in);
//
//		// 총합 -> 총합을 담아줄 변수
//		// 개수 -> 개수를 세서 담아줄 변수
//		// 이지선다 -> 논리형변수를 만들어서 사용
//
//		boolean isMatched = false;
//		for (int i = 0; i < 10; i++) {
//			System.out.print("찾는 숫자를 입력 : ");
//			int guess = scan.nextInt();
//
//			if (guess == magicNumber) {
//				System.out.println((i + 1) + "번째에 맞췄습니다.");
//				isMatched = true;
//				break;
//			} else if (guess > magicNumber) {
//				System.out.println("Down!");
//			} else if (guess < magicNumber) {
//				System.out.println("Up!");
//			}
//
//		}
//
//		// 정답을 못맞춘 경우에는 "정답을 맞추지 못했습니다."
//		// 라고 출력하기
//		// if(!isMatched)
//		if (isMatched == false) {
//			System.out.println("정답을 맞추지 못했습니다.");
//		}

		// 기타제어문(continue,break)의 특징
		// 1.기타제어문 바로 아래는 어떠한 코드도 올 수 없다.
		// 2.반복문 안에서만 사용이 가능하다.

		// 3.다중 반복문일때 기타제어문을 가지고 있는 반복문에 대해서만 적용이 된다.
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					// continue; //가장 가까운 증감식으로 이동
					// break; //가장 가까운 반복문만 중단
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("-------------------------");

		// 라벨을 이용하면 내가 원하는 반복문에 적용시킬수 있다.
		happy: for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j % 2 == 0) {
					break happy;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
