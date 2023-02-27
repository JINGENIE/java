package array;

import java.util.Scanner;

public class p121 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
	//true 는 게속 반복하라는 뜻	
			System.out.println("Input Command[q,i,d,s]");
			String cmd = sc.next();
			if(cmd.equals("q")) {
				System.out.println("QUIT");
				break;
			}else if(cmd.equals("i")) {
				System.out.println("Insert");
				System.out.println("input ID..");
				String id = sc.next();
				System.out.println("input PWD..");
				String pwd = sc.next();
				System.out.println("input NAME..");
				String name = sc.next();
				
				System.out.printf("%s, %s, %s Inserted.. \n" , id, pwd, name);
			}else if(cmd.equals("s")){
				System.out.println("Select");
			}else {
				System.out.println("Invalid command");
				System.out.println("Try agin");
				
			}
		}//end while
		System.out.println("BYE...");
		sc.close();
		


	}

}
