import com.sinc.intern.thread.CharThread;
import com.sinc.intern.thread.PrtThread;

public class PrtMain {

	public static void main(String[] args) {
		PrtThread prt = new PrtThread();
		
		CharThread charA = new CharThread('A', prt);
		Thread thread01 = new Thread(charA);
		thread01.start();

		CharThread charB = new CharThread('B', prt);
		Thread thread02 = new Thread(charB);
		thread02.start();
	}
	
}
