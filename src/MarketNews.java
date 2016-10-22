
public class MarketNews extends Thread {
	public MarketNews (String str) {
		super(str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				sleep(1000);
				System.out.println("The market is improving " + i);
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + e.toString());
			}
		}
	}

}
