
public class StringDemoMain {
	
	public static int XXX = 10;

	public static void main(String[] args) {
		// String str01 = "sean", str02 = "sean"; -> 기본타입, literal pool에 올라감
		
		// 참조타입 -> heap영역에 올라감
		String str01 = new String("sean");
		String str02 = new String("sean");
		
		// 기본타입 형태의 비교
		if (str01 == str02) {
			System.out.println("str01 == str02");
		}else {
			System.out.println("str01 != str02");
		}
		
		// 참조타입 형태의 비교
		if (str01.equals(str02)) {
			System.out.println("str01 == str02");
		}else {
			System.out.println("str01 != str02");
		}
	}

}
