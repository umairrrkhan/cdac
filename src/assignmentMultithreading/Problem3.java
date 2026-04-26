package assignmentMultithreading;


class Message implements Runnable{
	public void run() {
		System.out.println("message 1 ");
	}
}

class Message2 implements Runnable{
	public void run() {
		System.out.println("message2 : ");
	}
}

class Message3 implements Runnable{
	public void run() {
		System.out.println("message 3 ");
	}
}


public class Problem3 {

	public static void main(String args[]) throws InterruptedException {
		Thread t1 = new Thread(new Message());
        Thread t2 = new Thread(new Message2());
        Thread t3 = new Thread(new Message3());
        
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();
        
        t3.start();
        t3.join();
	}
}
