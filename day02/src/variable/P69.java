package variable;

public class P69 {

	public static void main(String[] args) {
		String str = "abcdef";
		str = str.toUpperCase();
		System.out.println(str);
		
		String str2 = str.replace('A','Z');
		System.out.println(str2);
		//주소.명령어
		int lng = str.length();
		System.out.println(lng);
		
		int apple = str.indexOf("B");
		System.out.println(apple);
		
		char c = str.charAt(0);	
		System.out.println(c);
	
		String str3 = str.substring(2,3);
		System.out.println(str3); //모르겠음 다시보기
		
		
//		String email = "jmlee@tonesol.com";
//		String id = "";
//		String domain = "";
//		System.out.printf("%s, %s", id, domain)
//		
	}

}
