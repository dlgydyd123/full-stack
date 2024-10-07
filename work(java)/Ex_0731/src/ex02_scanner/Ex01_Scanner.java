package ex02_scanner;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 :");
		int age = scan.nextInt();
		System.out.printf("제 나이는 %d세 입니다.\n",age);
		System.out.println("---------------------------");
		
		
		System.out.print("이름을 입력해 주세요 :");
		String name = scan.next();
		System.out.print("나이를 입력해 주세요 :");
		int age2 = scan.nextInt();
		System.out.print("주소를 입력해 주세요 :");
		scan.nextLine();
		String adress = scan.nextLine();
		System.out.print("키를 입력해 주세요 :");
		double height = scan.nextDouble();
		
		System.out.printf("제 이름은 %s 입니다.\n",name);
		System.out.printf("제 나이는 %d살 입니다.\n", age2);
		System.out.printf("제 주소는 %s 입니다.\n", adress);
		System.out.printf("제 키는 %.1fcm 입니다.\n", height);
		
		
	}

}
