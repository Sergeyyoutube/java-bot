import java.io.File;
import java.io.IOException;

import javax.sound.sampled.*;
import java.util.*;


public class main {
	public static void main(String[] args) {
		System.out.println("Идёт загрузка ресурсов...");
		Scanner scan = new Scanner(System.in);
		int c_scan;
		
		//Запуск программы
		sound er = new sound();
		help c1 = new help();
		creator cf = new creator();
		settings_bot sb = new settings_bot();
		c_print print = new c_print();
		calculator calc = new calculator();
		geniy gen = new geniy();
		date date = new date();
		c2 c2 = new c2();
		random rand = new random();
		File Clap = new File("hi.wav");
		System.out.println("Привет");
		PlaySound(Clap);
		if(sb.hacker == 0) {
			System.out.println(er.c1_1);
			System.out.println(er.c1_2);
			System.out.println(er.c1_3);
			System.out.println(er.c1_4);
			System.out.println(er.c1_5);
			PlaySound(c1.help_1);
			System.out.println(er.c1_6);
			System.out.println(er.c1_7);
			PlaySound(c1.c);
		} if (sb.hacker == 1) {
			System.out.println(er.c1_1);
			System.out.println(er.c1_2);
			System.out.println(er.c1_3);
			System.out.println(er.c1_4);
			System.out.println(er.c1_5_2);
			PlaySound(c1.help_1);
			PlaySound(c1.b);
			System.out.println(er.c1_6);
			System.out.println(er.c1_7);
			PlaySound(c1.c);
		}
		
		
		//Команды
		System.out.println(er.print);
		PlaySound(print.print);
		c_scan = scan.nextInt();
		if(c_scan == 1) {
			System.out.println(er.c1_1);
			System.out.println(er.c1_2);
			PlaySound(c1.help_1);
		} if (c_scan == 2 && sb.debug == 0 && sb.beta == 0 && sb.creator == 0) {
			System.out.println(er.c2_1);
			PlaySound(c2.a);
		} if (c_scan == 2 && sb.debug == 1 && sb.beta == 0 && sb.creator == 0) {
			System.out.println(er.c2_2);
			PlaySound(c2.b);
		} if (c_scan == 2 && sb.debug == 1 && sb.beta == 1 && sb.creator == 1) {
			System.out.println(er.c2_4);
			PlaySound(c2.d);
		} if (c_scan == 2 && sb.debug == 1 && sb.beta == 1 && sb.creator == 0) {
			System.out.println(er.c2_3);
			PlaySound(c2.c);
		} if (c_scan == 2 && sb.debug == 1 && sb.beta == 0 && sb.creator == 1) {
			System.out.println(er.c2_7);
			PlaySound(c2.v);
		} if (c_scan == 2 && sb.debug == 0 && sb.beta == 1 && sb.creator == 1) {
			System.out.println(er.c2_8);
			PlaySound(c2.x);
		} if (c_scan == 2 && sb.debug == 0 && sb.beta == 1 && sb.creator == 0) {
			System.out.println(er.c2_6);
			PlaySound(c2.f);
		} if (c_scan == 3) {
			rand.c3_action();
		} if (c_scan == 4) {
			calc.calc();
		} if (c_scan == 5) {
			gen.g_start();
		} if (c_scan == 6) {
			date.d_st();
		} if (c_scan == 7) {
			cf.cfile();
		}
}
	//Обработка звука
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