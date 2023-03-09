package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetipAddress {
	// IP 가져오는 유틸리티

	public static String getipAddress() {
		String ipAddr = "";
		Properties props = new Properties();
		String fileName = "file.txt";

		try (FileInputStream in = new FileInputStream(fileName)) {
			props.load(in);// 파일안의 내용을 담는다.
		} catch (IOException e) {
			System.out.println("문제 발생!!!");
		}

		ipAddr = props.getProperty("IP_ADDR");
		return ipAddr;
	}
}
