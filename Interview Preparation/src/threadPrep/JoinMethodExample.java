package threadPrep;

public class JoinMethodExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1  = new Thread(()->{
			System.out.println("t1 is running ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1 is done");
			
		});
		
		Thread t2  = new Thread(()->{
			
			System.out.println("t2 is running ");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t2 is done");
			
		});
		t1.run();
		t2.run();
		t2.join();
	}

}
