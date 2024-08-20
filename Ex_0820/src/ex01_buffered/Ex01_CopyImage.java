package ex01_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex01_CopyImage {
	public static void main(String[] args) {
		// 보조스트림을 이용해서 이미지를 복사
		// wall_copy3.jpg이름으로 복사하기

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("D:\\web0900_lhy\\1.java/wall.jpg");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("D:\\web0900_lhy\\1.java/wall_copy3.jpg");
			bos = new BufferedOutputStream(fos);
			int read = 0;
			while ((read = bis.read()) != -1) {
				bos.write(read);
			} 
		} catch (Exception e) {

		} finally {
			try {
				if (bos != null) {bos.close();}
				if (fos != null) {fos.close();}
				if (bis != null) {bis.close();}
				if (fis != null) {fis.close();}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
