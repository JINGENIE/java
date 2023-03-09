package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		Properties props = new Properties();
		String fileName = "file.txt";
		FileInputStream in = null;
		try {
			in = new FileInputStream(fileName);//읽어드리기
			props.load(in);//파일안의 내용을 담는다.
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			// finally: 정상적으로 끝나도 클로즈 실행, 비정상적으로 끝나도 클로즈 실행됨
		}

		String ip = props.getProperty("IP_ADDR");//담긴 내용안에서 " 읽어드려서 실행을 한다
		int port = Integer.parseInt(props.getProperty("PORT"));
		System.out.printf("%s 서버로 %d 포트로 접속..",ip,port);
	
	}

}
