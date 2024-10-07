package ex01_buffered;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {

	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;

		try {
			in = new FileInputStream("D:\\web0900_lhy\\1.java/test.txt");
			is = new InputStreamReader(in, "UTF-8");
			int read = 0;
			
			while((read = is.read())!=-1) {
				System.out.print((char)read);
			}
			
			//예외가 발생했을 때 catch로 가기 때문에 close()가 안된다.
			//is.close();
			//in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(is != null)is.close();
				if(in != null)in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
