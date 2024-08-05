package ex03_method;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		Start st = new Start();
		
		while(true){
		System.out.print("숫자를 입력해주세요 :");
		int num = scan.nextInt();
		String result = st.upDown(num);
		System.out.println(result);
		if(!result.equals("Down!") && !result.equals("Up!")) {
			break;
		}
		}
	}

}
