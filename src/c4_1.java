import java.io.File;
import javax.sound.sampled.*;

public class c4_1 {
	File n = new File("c4_1.wav");
	File x = new File("c4_2.wav");
	File c = new File("c4_3.wav");
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
