package ex02_for;

public class Ex02_for {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.println(i + " " + j);
			}
		}

		System.out.println();
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 4; j++) {
				System.out.print(1 + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------");
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("--------------------");

		int count = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%02d ", ++count);
			}
			System.out.println();
		}

		System.out.println();

		count = 65;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.printf("%s ", (char) count++);
			}
			System.out.println();
		}

		System.out.println();

		char ch = 'A';
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 4; j++) {
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10; j++) {
				int num = j + i;
				if (num > 10) {
					System.out.printf("%d ", num - 10);
				} else {
					System.out.printf("%d ", num);
				}

			}
			System.out.println();
		}

	}

}
