package board;

public class DAO {//DB에 넣는 기능
	
	public void insert(String str) {
		System.out.println("Inserted Oracle Database Row:" +str);
	}
	
	public void update(int num, String str) {
		//해당 글번호를 입력하고 글 내용을 이렇게 업데이트 하겠습니다.
		System.out.println("Updated Oracle Database Row:"+num+"" +str); //해당글 번호와 내용으로 업데이트 되었습니다
	}
	
	public void delete(int num) {
		System.out.println("Deleted Oracle Database Row:" +num);
	}
	
	public String select(int num) {
		return "Hi Database ...";
	}

}
