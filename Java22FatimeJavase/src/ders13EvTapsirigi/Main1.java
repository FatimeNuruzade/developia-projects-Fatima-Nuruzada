package ders13EvTapsirigi;

public class Main1 {
static void playMedia(Media m) {
	m.play();
	if(m instanceof Music) {
		Music music = (Music) m;
		((Music) m).listen();
		
	} else if(m instanceof Video){
		Video video = (Video) m;
		video.watch();
	}
}
public static void main(String[] args) {
	Media m1 = new Music();
	Media m2 = new Video();
	playMedia(m1);
	playMedia(m2);
}
}
