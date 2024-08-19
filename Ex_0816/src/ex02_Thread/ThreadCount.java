package ex02_Thread;

public class ThreadCount extends Thread {

	private int count;

	public ThreadCount(int count) {
		this.count = count;
	}

	@Override
	public void run() {

		for (int i = count; i >= 0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("종료");
	}

}
