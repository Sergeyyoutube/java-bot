import java.io.File;
import java.util.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class geniy {
	
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
	
	public void g_start() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int user, cpu, done, max;
		c5_1 c5_1 = new c5_1();
		sound er = new sound();
		settings_bot sb = new settings_bot();
				
		System.out.println(er.c5_1);
		max = 10;
		PlaySound(c5_1.a);
		cpu = rand.nextInt(max);
		done = cpu;
		if(sb.debug == 0) {
			System.out.println(er.c5_5);
			PlaySound(c5_1.f);
			System.out.println(er.c5_6);
			PlaySound(c5_1.v);
			System.out.println(er.c5_2);
			PlaySound(c5_1.b);
		} if (sb.debug == 1) {
			System.out.println(er.c5_5);
			PlaySound(c5_1.f);
			System.out.println(er.c5_7);
			PlaySound(c5_1.n);
			System.out.println(er.c5_2 + done);
			PlaySound(c5_1.b);
		}
		PlaySound(c5_1.e);
		PlaySound(c5_1.e);
		PlaySound(c5_1.x);
		user = scan.nextInt();
		if(user == done) {
			System.out.println(er.c5_3);
			PlaySound(c5_1.c);
		} if (user > done) {
			System.out.println(er.c5_4 + cpu);
			PlaySound(c5_1.d);
		} if (user < done) {
			System.out.println(er.c5_4 + cpu);
			PlaySound(c5_1.d);
		}
	}
}
