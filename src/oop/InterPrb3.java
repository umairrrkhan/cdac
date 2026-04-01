package oop;


interface Playable{
	void play();
	void pause();
	void stop();
}

class audioPlayer implements Playable{
	String songname;
	
	
	audioPlayer(String songname){
		this.songname  = songname;
		
		System.out.println("audio player constructor got called");
	}
	
	
	public void play() {
		System.out.println(this.songname + " this song is playing");
	}
	
	public void pause() {
		System.out.println(this.songname + " this song is now pause");
	}
	
	public void stop() {
		System.out.println(this.songname + "audio is now stop ");
	}
}

class videoPlayer implements Playable{
	
	String videoName;
	String resolution;
	
	videoPlayer(String videoName , String resolution){
		this.videoName = videoName;
		this.resolution = resolution;
		System.out.println("this is the vdeoPlayer const");
	}
	@Override
	public void play() {
		System.out.println(this.videoName + "video is playing" + "resolution is : "+this.resolution);
	}
	@Override
	public void stop() {
		System.out.println(this.videoName + "stop ");
	}
	@Override
	public void pause() {
		System.out.println(this.videoName + " pause here");
	}
	
}

public class InterPrb3 {
	
	public static void main(String[] args) {
		
		videoPlayer v[] = new videoPlayer[1];
		
		v[0] = new videoPlayer("mai hu kon", "high");
		
		audioPlayer a[] = new audioPlayer[1];
		a[0] = new audioPlayer("mai hu na ");
		
		
		for (videoPlayer g : v) {
			g.play();
			g.pause();
			g.stop();
		}
		
		for (audioPlayer y : a) {
			y.play();
			y.pause();
			y.stop();
		}
		
	}

}
