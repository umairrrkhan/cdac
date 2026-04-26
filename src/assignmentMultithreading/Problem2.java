package assignmentMultithreading;

class EvenPrinter implements Runnable{
	private final Object lock ;
	private final int max;
	
	EvenPrinter(Object lock , int max){
		this.lock = lock;
		this.max = max;
	}
	
	public void run() {
		for (int i = 0 ; i <= max ; i+=2) {
			synchronized(lock) {
				System.out.println(i + " ");
				lock.notify();
				try {
					if(i < max ) lock.wait();
				} catch(InterruptedException e) {}
			}
		}
	}
}

class OddPrinter implements Runnable {
    private final Object lock;
    private final int max;

    OddPrinter(Object lock, int max) {
        this.lock = lock;
        this.max = max;
    }

    public void run() {
        for (int i = 1; i <= max; i += 2) {
            synchronized (lock) {
                System.out.print(i + " ");
                lock.notify();
                try {
                    if (i < max) lock.wait();
                } catch (InterruptedException e) {}
            }
        }
    }
}

public class Problem2 {
	
	public static void main(String args[] ) throws InterruptedException {
		Object lock = new Object();
		int max = 9;
		
		Thread even = new Thread(new EvenPrinter(lock , max));
		Thread odd = new Thread(new OddPrinter(lock, max));
		
		even.start();
		
		Thread.sleep(10);
		
		odd.start();
	}
	
	

}
