import java.io.File;
import javax.sound.sampled.*;
import java.util.*;


public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c_scan;
		
		//Запуск программы
		sound er = new sound();
		help c1 = new help();
		test_sound ts = new test_sound();
		c_print print = new c_print();
		calculator calc = new calculator();
		geniy gen = new geniy();
		c2 c2 = new c2();
		random rand = new random();
		File Clap = new File("hi.wav");
		System.out.println("Привет");
		PlaySound(Clap);
		System.out.println(er.c1_1);
		System.out.println(er.c1_2);
		System.out.println(er.c1_3);
		System.out.println(er.c1_4);
		System.out.println(er.c1_5);
		PlaySound(c1.help_1);
		
		//Команды
		System.out.println(er.print);
		PlaySound(print.print);
		c_scan = scan.nextInt();
		if(c_scan == 1) {
			System.out.println(er.c1_1);
			System.out.println(er.c1_2);
			PlaySound(c1.help_1);
		} if (c_scan == 2) {
			System.out.println(er.c2_1);
			PlaySound(c2.c2);
		} if (c_scan == 3) {
			rand.c3_action();
		} if (c_scan == 1010) {
			ts.ts_action();
		} if (c_scan == 4) {
			calc.calc();
		} if (c_scan == 5) {
			gen.g_start();
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