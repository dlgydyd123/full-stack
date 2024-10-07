package ex03_method;

import java.util.Scanner;

public class TimesTableMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TimesTable tt = new TimesTable();
		System.out.print("정수 하나를 입력해 주세요 : ");
		int num = scan.nextInt();
		tt.showTable(num);
		

	}

}
