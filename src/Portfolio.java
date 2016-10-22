
public class Portfolio extends Thread {
	public Portfolio (String str) {
		super(str);
	}
	
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			try {
				sleep(700);
				System.out.println("You have " + (500+i) + " shares of IBM");
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + e.toString());
			}
		}
	}

}
