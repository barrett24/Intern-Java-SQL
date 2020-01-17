import com.sinc.intern.tv.factory.BeanFactory;
import com.sinc.intern.tv.util.TV;

public class TvMain {

	public static void main(String[] args) {
		// 이 객체 하나만 생성하여 삼성, 엘지 모두 관리하자 -> 싱글턴
		// 클라이언트에서 객체르 받는게 아니라 인스턴스만 넘겨받는다.
		// 동일한 객체를 여러번 호출해도 인스턴스는 한번만 생성된다
		BeanFactory factory = BeanFactory.getInstance();
		try {
			TV tv = factory.getBrand("samsung");
			tv.turnOn();
			//System.exit(1);
			System.out.println(tempFunc());
		} catch (NullPointerException e) {
			System.out.println(e);
		} finally {
			System.out.println("bye~~");
		}
	}
	public static int tempFunc() {
		try {
			return 1;
		} finally {
			return 2;
		}
		
	}
}

