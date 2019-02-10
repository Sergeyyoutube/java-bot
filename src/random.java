import java.io.File;
import java.util.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class random {
	int max = 100;
	int max_debug = 101;
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	int user, ostatok;
	
	static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();
			Thread.sleep(clip.getMicrosecondLength()/1000);
		} catch(Exception e){
			sound er = new sound();
			System.out.println(e + er.e);
		}
	}
	
	public void c3_action() {
		sound er = new sound();
		c3_1 c3_1 = new c3_1();
		settings_bot sb = new settings_bot();
		
		if(sb.debug == 1) {
			System.out.println(er.c3_6);
			PlaySound(c3_1.f);
		}
		if(sb.debug == 0) {
			System.out.println(er.c3_2);
			PlaySound(c3_1.b);
		} if (sb.debug == 1) {
			System.out.println(er.c3_5);
			PlaySound(c3_1.e);
		}
		
		user = scan.nextInt();
		if(user > max && sb.debug == 0) {
			ostatok = user - max; //Узнаём остаток
			user = user - ostatok; // Ставим значение max
			System.out.println(er.c3_3);
			PlaySound(c3_1.c);
		}
		if(user > max_debug && sb.debug == 1) {
			ostatok = user - max_debug; //Узнаём остаток
			user = user - ostatok; // Ставим значение max
			System.out.println(er.c3_7);
			PlaySound(c3_1.x);
		}
		System.out.println(er.c3_1);
		PlaySound(c3_1.a);
	for(int loop=1; loop<=1; loop++){
        System.out.println(rand.nextInt(max));
    	}
	}
}