import java.io.File;
import javax.sound.sampled.*;

public class n_0 {
	File n0 = new File("0.wav");
	File n1 = new File("1.wav");
	File n2 = new File("2.wav");
	File n3 = new File("3.wav");
	File n4 = new File("4.wav");
	File n5 = new File("5.wav");
	File n6 = new File("6.wav");
	File n7 = new File("7.wav");
	File n8 = new File("8.wav");
	File n9 = new File("9.wav");
	sound er = new sound();
	
	static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		}catch(Exception e){
			sound er = new sound();
			System.out.println(e + er.e);
		}
	}}
