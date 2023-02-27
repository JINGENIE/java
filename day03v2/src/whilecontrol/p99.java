package whilecontrol;

public class p99 {

	public static void main(String[] args) {
	
			myfor:
			for(int i=2;i<10;i++) {
				System.out.printf("%d 단 \n",i);
				for(int j=1;j<10;j++) {
					System.out.printf("%d * %d = %d \t",i,j,(i*j));
					if( (i*j)==21) {
						break myfor; //안쪽 포문 뿐아니라 전부다 ,,, 멈춘다는 말
					}
					
					
					
				}
			System.out.println("");
			}

	}

}
