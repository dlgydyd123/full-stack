package ex02_InputStream;

public class Ex03_FileInputStream {

	public static void main(String[] args) {
		byte[] keyboard = new byte[100];

		try {
			System.out.print("값 : ");
			// 키보드에서 값을 입력받기 위한 표준 입력장치 스트림
			//System.in -> inputStream객체를 가지고 있는 필드
			System.in.read(keyboard);

			String s = new String(keyboard).trim();
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
