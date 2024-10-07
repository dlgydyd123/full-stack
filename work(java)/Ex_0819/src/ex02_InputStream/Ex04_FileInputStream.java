package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		// 특정 경로에 file.txt문서를 만들고 아무 문장이나 입력해둔다.
		// file.txt의 내용을 읽어온 뒤, 회문인지 아닌지 판별해서 출력하시오

		String path = "D:\\web0900_lhy\\1.java/file.txt";
		File f = new File(path);

		byte[] read = new byte[(int) f.length()];

		FileInputStream fis = null;

		if (f.exists()) {
			try {
				fis = new FileInputStream(f);

				fis.read(read);

				// read배열에 들어있는 모든 요소를 문자열로 바꿔서 넣음
				String res = new String(read);
				String resrev = "";
				for (int i = res.length(); i > 0; i--) {
					resrev += res.charAt(i - 1);
				}
				if (res.equals(resrev)) {
					System.out.println(res + "는(은) 회문입니다.");
				} else {
					System.out.println(res + "는(은) 회문이 아닙니다.");
				}
			} catch (Exception e) {

			} finally {
				try {
					fis.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
