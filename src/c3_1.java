import java.io.File;
import javax.sound.sampled.*;

public class c3_1 {
	File a = new File("c3_1.wav");
	File b = new File("c3_2.wav");
	File c = new File("c3_3.wav");
	File e = new File("c3_5.wav");
	File f = new File("c3_6.wav");
	File x = new File("c3_7.wav");
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
