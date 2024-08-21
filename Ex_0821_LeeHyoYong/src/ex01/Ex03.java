package ex01;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random ran = new Random();
		int money = (ran.nextInt(500) + 1) * 10;
		int[] coin = { 500, 100, 50, 10 };
		int count = 0;
		System.out.println(money + "원");
		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			money = money % coin[i];
			System.out.printf("%d : %d개\n", coin[i], count);
		}

	}
}
