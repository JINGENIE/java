package com.kbstar.frame;

public class MakeNewMessage {
	public static String makeMessage(String code) {
		String result = "";
		switch (code) {
		case "EX0004":
			result = "EX0004 실패..";
			break;
		case "EX0005":
			result = "EX0005..";
			break;
		case "EX0006":
			result = "EX0006..";
			break;
		default:
			result = "고객센터에 문의하세요";
		}
		return result;
	}
}
