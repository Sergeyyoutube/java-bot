import java.io.File;
import javax.sound.sampled.*;

public class c010_1 {
	File a = new File("c010_1.wav");
	File b = new File("c010_2.wav");
	File c = new File("c010_3.wav");
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
