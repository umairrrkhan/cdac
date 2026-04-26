package assignmentMultithreading;


class PlayThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("playing song... " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
        }
    }
}

class DownloadThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("downloading next song... " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}


public class Problem4 {

	public static void main(String args[]) {
		 PlayThread play = new PlayThread();
	        DownloadThread download = new DownloadThread();

	        play.start();
	        download.start();
	}
}
