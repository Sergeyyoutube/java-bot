import java.io.File;
import javax.sound.sampled.*;

public class help {
	File help_1 = new File("help.wav");
	File b = new File("help2.wav");
	File c = new File("help3.wav");
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
	}
}