package ex06_Bufferd;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex01_BufferedInput {
	public static void main(String[] args) {
		FileInputStream in = null;
		BufferedInputStream bis =null;
		
		try {
			in = new FileInputStream("D:\\web0900_lhy\\1.java/reader.txt");
			bis = new BufferedInputStream(in);
			
			int code =0;
			
			while((code = bis.read()) !=-1) {
				System.out.print((char)code);
			}
		} catch (Exception e) {
			
		}finally {
			try {
				if(bis != null)bis.close();
				if(in != null)in.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
