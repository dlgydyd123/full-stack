package ex04_Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex02_FileReader {

	public static void main(String[] args) {
		// 특정경로에 reader.txt파일을 만들고 아무 내용이나 적는다.

		// reader.txt파일을 읽어서
		// 알파벳 대문자와 소문자의 개수를 출력하세요

		// 대문자 : X개
		// 소문자 : X개

		FileReader fr = null;

		try {
			fr = new FileReader("D:\\web0900_lhy\\1.java/reader.txt");
			int code = 0;
			int countBig = 0;
			int countSmall = 0;

			while ((code = fr.read()) != -1) {
				System.out.print((char) code);
				if (code >= 'A' && code <= 'Z') {
					countBig++;
				}

				if (code >= 'a' && code <= 'z') {
					countSmall++;
				}

			}
			System.out.println();
			System.out.println("대문자 :" + countBig + "개");
			System.out.println("소문자 :" + countSmall + "개");

		} catch (Exception e) {

		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
