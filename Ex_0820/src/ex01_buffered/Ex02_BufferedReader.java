package ex01_buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex02_BufferedReader {
	public static void main(String[] args) {
		// 문자 기반 보조스트림의 경우, 버퍼에 데이터를 저장하여
		// 입력 또는 출력하기 때문에 한 단어 뿐만 아니라 문장단위로
		// 데이터를 읽거나 쓸 수 있다.
		FileReader reader = null;
		BufferedReader br = null;

		try {
			reader = new FileReader("D:\\web0900_lhy\\1.java/book.txt");
			br = new BufferedReader(reader);

			// 읽어온 문장을 저장하기 위한 변수
			String str = "";
			// 버퍼에 문자를 저장하기 때문에 한번에 읽는 것이 가능하다.
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (br != null) br.close();
				if (reader != null) reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
