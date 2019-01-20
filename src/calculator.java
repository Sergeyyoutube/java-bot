import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class calculator {
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
	public void calc() {
		
		c4_1 c4_1 = new c4_1();
		Scanner scan = new Scanner(System.in);
		int user1, user2, quest, done;
		sound er = new sound();
		
		System.out.println(er.c4_1);
		PlaySound(c4_1.n);
		user1 = scan.nextInt();
		System.out.println(er.c4_1);
		PlaySound(c4_1.n);
		user2 = scan.nextInt();
		System.out.println(er.c4_3);
		PlaySound(c4_1.c);
		quest = scan.nextInt();
		if(quest == 1) {
			done = user1 + user2;
			PlaySound(c4_1.x);
			System.out.println(er.c4_2 + done);
		} if (quest == 2) {
			done = user1 - user2;
			PlaySound(c4_1.x);
			System.out.println(er.c4_2 + done);
		} if (quest == 3) {
			if(user2 > user1) {
				done = user2 / user1;
				PlaySound(c4_1.x);
				System.out.println(er.c4_2 + done);
			} if (user1 > user2) {
				done = user1 / user2;
				PlaySound(c4_1.x);
				System.out.println(er.c4_2 + done);
			}
		} if (quest == 4) {
			done = user1 * user2;
			PlaySound(c4_1.x);
			System.out.println(er.c4_2 + done);
		}		
	}
}
