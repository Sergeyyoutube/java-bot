import java.io.File;
import javax.sound.sampled.*;

public class c7_1 {
	File error = new File("error.wav");
	File a = new File("c7_1.wav");
	File b = new File("c7_2.wav");
	File c = new File("c7_3.wav");
	File d = new File("c7_4.wav");
	
	//Вторая часть реплик
	
	File e = new File("c7_5.wav");
	File f = new File("c7_6.wav");
	File x = new File("c7_7.wav");
	File l = new File("c7_8.wav");
	
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
