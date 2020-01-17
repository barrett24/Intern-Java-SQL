import com.sinc.intern.excep.ExceptionDemo;

public class ExceptionMain {
	/*
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		String strAry [] = {"a", "b", "c", "d"};
		try {
			for (int idx=0; idx <= strAry.length; idx++) {
				System.out.println(strAry[idx]);
			}
		} finally {
			// finally 가 없다면 출력되지 않는다
			System.out.println("Main end");
		}
	}
	*/
	public static void main(String[] args) {
		ExceptionDemo demo = new ExceptionDemo();
		try {
			//demo.compileE();
			boolean bValue = demo.a(1);
			System.out.println(bValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main end");
	}

}
