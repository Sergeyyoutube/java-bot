import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class date {
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
	public void d_st() {
		Scanner scan = new Scanner(System.in);
		sound str = new sound();
		c6_1 voice = new c6_1();
		Date t = new Date();
		hs hs = new hs();
	    File of = new File(hs.fileName);
		
		System.out.println(str.c6_1);
		PlaySound(voice.a);
		String dt = t.toString();
		int result;
		System.out.println(str.c6_2);
		PlaySound(voice.b);
		result = scan.nextInt();
		if(result == 1) {
			System.out.println(str.c6_3 + dt);
			PlaySound(voice.c);
			if(of.exists() == true) {
				System.out.println(str.c6_5);
				PlaySound(voice.e);
			}
		} if (result == 0) {
			System.out.println(str.c6_4);
			PlaySound(voice.d);
			if(of.exists() == true) {
				System.out.println(str.c6_5);
				PlaySound(voice.e);
			}
		}
	}
}
