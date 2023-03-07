package cal;

public class Cal {
	public static double div(int a, int b) throws Exception {
		double result = 0.0;
		try {
			result = a / b;
		} catch (Exception e) {
//			System.out.println("잘못입력하셨습니다."); 여기서 에러메세지 표출해도 화면단에 안나옴
			throw e;

		}
		return result;
	}

	public static double div(double a, double b) throws InfinityException {
		double result = 0.0;
		if (b==0.0) {
			throw new InfinityException("B0001");
		}
		result = a / b;
		return result;
	}
}
