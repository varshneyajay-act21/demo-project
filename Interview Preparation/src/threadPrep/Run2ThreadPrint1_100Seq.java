package threadPrep;

public class Run2ThreadPrint1_100Seq {

	int counter=1;
	static int N;
	public void printEvenNumber() {
		synchronized (this) {
			while(counter<N) {
				while(counter%2==1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter++ +" ");
				notify();
			}
		}
		
	}

	public void printOddNumber() {

		synchronized (this) {
			while(counter<N) {
				while(counter%2==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(counter++ +" ");
				notify();
			}
		}
	}

	public static void main(String[] args) {
		
		Run2ThreadPrint1_100Seq mt = new Run2ThreadPrint1_100Seq();
		N=10;
		
		Thread t1 = new Thread(()->mt.printOddNumber());
		Thread t2 = new Thread(()->mt.printEvenNumber());
		t1.start();
		t2.start();
	}

}
