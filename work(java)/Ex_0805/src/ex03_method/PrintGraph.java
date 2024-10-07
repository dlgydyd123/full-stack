package ex03_method;

public class PrintGraph {

	public void draw(int[] num) {
		for (int i = 0; i <= 9; i++) {
			System.out.print(i + "의 갯수 : ");
			int count = 0;
			for (int j = 0; j < num.length; j++) {
				if (i == num[j]) {
					count++;
				}

			}
			for (int k = 1; k <= count; k++) {
				System.out.print("#");
			}
			System.out.println(" " + count);

		}
	}
}
