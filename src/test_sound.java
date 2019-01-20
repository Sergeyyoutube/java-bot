import java.io.File;
import java.util.*;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class test_sound {
	c_print c_print = new c_print();
	c2 c2 = new c2();
	error error = new error();
	help help = new help();
	sound er = new sound();
	c3_1 c3_1 = new c3_1();
	n_0 n_0 = new n_0();
	c010_1 c010_1 = new c010_1();
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
	
	public void ts_action() {	
		Scanner scan = new Scanner(System.in);
		int user;
		
		System.out.println(er.c010_2);
		PlaySound(c010_1.b);
		user = scan.nextInt();
		
		if(user == 1) {
			System.out.println(er.c010_1);
			PlaySound(c010_1.a);
		} if (user == 2) {
			PlaySound(c_print.print);
			System.out.println(er.print);
		} if (user == 3) {
			PlaySound(c2.c2);
			System.out.println(er.c2_1);
		} if (user == 4) {
			PlaySound(error.n);
			System.out.println(er.e);
		} if (user == 5) {
			PlaySound(help.help_1);
			System.out.println(er.c1_1);
			System.out.println(er.c1_2);
			System.out.println(er.c1_3);
		} if (user == 6) {
			PlaySound(c3_1.a);
			System.out.println(er.c3_1);
		} if (user == 7) {
			PlaySound(c3_1.b);
			System.out.println(er.c3_2);
		} if (user == 8) {
			PlaySound(c3_1.c);
			System.out.println(er.c3_3);
		} if (user == 9) {
			PlaySound(c3_1.d);
			System.out.println(er.c3_4);
		} if (user == 10) {
			PlaySound(n_0.n0);
			System.out.println(er.n_0);	
		} if (user == 11) {
			PlaySound(n_0.n1);
			System.out.println(er.n_1);
		} if (user == 12) {
			PlaySound(n_0.n2);
			System.out.println(er.n_2);
		} if (user == 13) {
			PlaySound(n_0.n3);
			System.out.println(er.n_3);
		} if (user == 14) {
			PlaySound(n_0.n4);
			System.out.println(er.n_4);
		} if (user == 15) {
			PlaySound(n_0.n5);
			System.out.println(er.n_5);
		} if (user == 16) {
			PlaySound(n_0.n6);
			System.out.println(er.n_6);
		} if (user == 17) {
			PlaySound(n_0.n7);
			System.out.println(er.n_7);
		} if (user == 18) {
			PlaySound(n_0.n8);
			System.out.println(er.n_8);
		} if (user == 19) {
			PlaySound(n_0.n9);
			System.out.println(er.n_9);
		} if (user == 20) {
			PlaySound(c010_1.b);
			System.out.println(er.c010_2);
		} if (user > 21) {
			System.out.println(er.c010_3);
			PlaySound(c010_1.c);
		} if (user == 21) {
			PlaySound(c010_1.c);
			System.out.println(er.c010_3);
		}
    }
}
