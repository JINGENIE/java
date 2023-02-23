package variable;

public class P64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 10;
			double d = 10.2345;
			String str1 = "abc";
			String str2 = "abc";
			str1 = "def";
			System.out.printf("%d %4.2f %s \n",a,d,str1);
			if(str1 == str2) {
					System.out.println("OK");
					//주소값을 비교하는거 (ppt에서 그렸던 # 영역)
			}
			if(str1.equals((str2))) {
				System.out.println("OK");
			}
			String str3 = new String("abc");
			String str4 = new String("abc");
	}

}
