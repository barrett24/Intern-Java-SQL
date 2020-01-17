import com.sinc.intern.thread.SincThread;

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("Main Strat");
		
		SincThread runnable = new SincThread();
		Thread thread = new Thread(runnable);
		thread.start();
		
		// 메인은 끝났지만 스래드는 남아서 계속 수행한다
		System.out.println("Main End");
	}

}
