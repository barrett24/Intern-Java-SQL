import com.sinc.intern.model.vo.SincVO;

public class SincMain {

	public static void main(String[] args) {
		SincVO obj01 = new SincVO();
		SincVO obj02 = new SincVO();
		SincVO obj03 = new SincVO("a", "b", "c");
		
		obj01.setInfo("admin", "admin", "최시영");
		System.out.println(obj01.getInfo());
		
		obj02.setPwd("admin");
		obj02.setId("admin");
		obj02.setName("시영초이");
		
		System.out.println(obj02.getInfo());
		System.out.println(obj03.getInfo());
	}
}
