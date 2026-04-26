package assignmentMultithreading;


class NumberTasks {
    void even() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("even numbers: 0 2 4 6 8");
    }
    void odd() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("odd numbers: 1 3 5 7 9");
    }
}


public class Problem6 {
	public static void main(String[] args) throws InterruptedException {
        NumberTasks tasks = new NumberTasks();
        
        tasks.even();   
        tasks.odd();    
    }
}
