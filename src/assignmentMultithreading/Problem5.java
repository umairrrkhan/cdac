package assignmentMultithreading;


class Countdown extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("countdown: " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class MessageDisplay extends Thread {
    public void run() {
        for (int i = 1; i <= 11; i++) { 
            System.out.println("message: tick " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}


public class Problem5 {
	public static void main(String[] args) {
        Countdown cd = new Countdown();
        MessageDisplay msg = new MessageDisplay();

        cd.start();
        msg.start();
    }

}
