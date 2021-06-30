import java.io.File;
import javax.sound.sampled.*;

public class c6_1 {
	File a = new File("c6_1.wav");
	File b = new File("c6_2.wav");
	File c = new File("c6_3.wav");
	File d = new File("c6_4.wav");
	File e = new File("c6_5.wav");
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
