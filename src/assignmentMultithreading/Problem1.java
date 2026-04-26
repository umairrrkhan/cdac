package assignmentMultithreading;

public class Problem1 {
	
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		
		System.out.println("thread name " + t.getName());
		System.out.println("thread id : "+ t.getId());
		System.out.println("priority: "+t.getPriority());
		System.out.println("state: "+t.getState());
		System.out.println("is alive : "+ t.isAlive());
		System.out.println("is deamon: "+ t.isDaemon());
		
	}

}
