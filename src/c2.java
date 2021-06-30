import java.io.File;
import javax.sound.sampled.*;

public class c2 {
	File a = new File("c2_1.wav");
	File b = new File("c2_2.wav");
	File c = new File("c2_3.wav");
	File d = new File("c2_4.wav");
	File e = new File("c2_5.wav");
	File f = new File("c2_6.wav");
	File v = new File("c2_7.wav");
	File x = new File("c2_8.wav");
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