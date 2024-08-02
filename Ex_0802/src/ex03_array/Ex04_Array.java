package ex03_array;

import java.util.Random;
import java.util.Scanner;

public class Ex04_Array {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] numbers = new int[10];

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(30) + 1;

			System.out.print(numbers[i] + " ");

			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}
		System.out.println();
		System.out.println("배열 안 짝수의 합 : " + sum);

		// 배열에서 영문자만 추출하여 이어붙혀 출력하기
		char[] cards = { '1', 'L', '2', 'O', '3', 'V', 'E', '4' };

		String myWord = "";

		for (int i = 0; i < cards.length; i++) {
			if (cards[i] >= 'A' && cards[i] <= 'Z' || cards[i] >= 'a' && cards[i] <= 'z') {
				myWord += cards[i];
			}
		}
		System.out.println(myWord);

		// 배열 arr에 담겨있는 모든 값의 값의 합을 구하세요
		int[] arr = { 10, 20, 30, 40, 50, };
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println("총합 : " + sum1);

		// 다음조건에 맞는 문제를 푸세요
		// - 키보드에서 배열의 길이를 입력받는다.
		// - 입력받은 길이만큼 알파벳을 넣고 출력한다.
		// ex) 배열의 길이를 입력하세요 : 5
		// ABCDE

		Scanner scan = new Scanner(System.in);
//		System.out.print("배열의 길이를 입력하세요 : ");
//		int len = scan.nextInt();
//		char[] alp = new char[len];  
//		for(int i = 0 ; i<alp.length; i++) {
//			alp[i] = (char)(65+i);
//			System.out.print(alp[i]);
//		}

		System.out.print("배열의 길이를 입력하세요 : ");
		int len = scan.nextInt();
		char[] alp = new char[len];
		char word = 'A';
		for (int i = 0; i < alp.length; i++) {
			System.out.print(alp[i] = word++);
		}
		System.out.println();

		// 동전의 개수 구하기
		// 10~5000사이의 난수를 변수에 담는다.
		// 1의 자리는 반드시 0이 되어야 합니다.
		// 발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드
		// 가능한 적은 수의 동전을 사용하도록 한다.
		// 4170
		// 500원
		// 100원
		// 50원
		// 10원

		int money = (ran.nextInt(500) + 1) * 10;// (0~499+1)*10
//		int money = ran.nextInt(4990)+10;
//		if (money % 10 != 0) {
//			money /= 10;
//			money *= 10;
//		}
		System.out.println("금액 : " + money + "원");
		int[] coin = { 500, 100, 50, 10 };
		int[] change = new int[4];
		for (int i = 0; i < coin.length; i++) {
			change[i] = money / coin[i];
			money %= coin[i];
			System.out.printf("%d원 : %d개\n", coin[i], change[i]);
		}

		// 로또번호 생성하기
		// 1~ 45사이의 난수를 발생시켜 로또번호를 배열에 저장하고
		// 출력하기

		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			int num = ran.nextInt(45) + 1;
			lotto[i] = num;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			System.out.print(lotto[i] + " ");
		}

//		
//		outer:for (int i = 0; i < lotto.length;) {
//			int num = ran.nextInt(45) + 1;
//			lotto[i] = num;
//			for(int j =0; j<i;j++) {
//				if(lotto[i] == lotto[j]) {
//					continue outer;
//				}
//			}
//			System.out.print(lotto[i] + " ");
//			i++;
//		}

	}

}
