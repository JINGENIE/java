package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test2 {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";

		try (FileInputStream in = new FileInputStream(fileName)){
			props.load(in);// 파일안의 내용을 담는다.
		} catch (IOException e) {
			System.out.println("문제 발생!!!");
			return;
		}

		String ip = props.getProperty("IP_ADDR");// 담긴 내용안에서 " 읽어드려서 실행을 한다
		System.out.println(ip);
	}

}
