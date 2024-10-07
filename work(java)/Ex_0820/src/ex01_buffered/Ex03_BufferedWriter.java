package ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_BufferedWriter {
	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;

		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			reader =new FileReader("D:\\web0900_lhy\\1.java/book.txt");
			writer = new FileWriter("D:\\web0900_lhy\\1.java/book_copy.txt");
			
			//보조 스트림 생성하기
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			
			//문장을 저장할 변수
			String str = "";
			
			while((str = br.readLine()) != null) {
				bw.write(str + "\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bw != null) bw.close();
				if(writer != null) writer.close();
				if(br != null) br.close();
				if(reader != null) reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}

		}
	}
}
