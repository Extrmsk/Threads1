
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarketNews mn = new MarketNews("Market News");
		mn.start();
		
		Portfolio p = new Portfolio("Portfolio");
		p.start();
		
		try {
			mn.join();
			p.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Test thread is finished");
		

	}

}
