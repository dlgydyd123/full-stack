package ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		UserInfo ui;
		Scanner scan = new Scanner(System.in);
		ArrayList<UserInfo> user = new ArrayList<>();

		outer :while (true) {
			ui = new UserInfo();
			System.out.print("아이디 생성 : ");
			String id = scan.next();
			ui.setId(id);
			for (int i = 0; i < user.size(); i++) {
				if (user.get(i).getId().equals(id)) {
					System.out.println("아이디가 중복됩니다.");
					continue outer;
				}
			}
			System.out.print("패스워드 입력 : ");
			int pwd = scan.nextInt();
			ui.setPwd(pwd);

			
			
				user.add(ui);
				for (int i = 0; i < user.size(); i++) {
					System.out.println(user.get(i).getId());
					System.out.println(user.get(i).getPwd());
					System.out.println("----------------------");
				
			}

		}

	}

}
