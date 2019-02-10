import java.io.*;
import java.util.*;
import javax.sound.sampled.*;

public class creator {
	
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
	
	public void cfile(){
		Scanner scan = new Scanner(System.in);
		int result;
		String fname1;
		final String fname2;
		sound str = new sound();
		String wrt;
		c7_1 voice = new c7_1();
		
		System.out.println(str.c7_1);
		PlaySound(voice.a);
		result = scan.nextInt();
		if(result == 1) {
			System.out.println(str.c7_2);
			PlaySound(voice.b);
			fname1 = scan.next();
			fname2 = fname1;
			File nfile = new File(fname2);
			try {
	            if (nfile.createNewFile()) {
	                System.out.println(str.c7_4);
	                PlaySound(voice.d);
	            } else {
	                System.out.println(str.c7_5);
	                PlaySound(voice.e);
	            }
	        } catch (Exception Ex) {
	            System.out.println(Ex.toString() + str.e);
	            PlaySound(voice.error);
	        }
			System.out.println(str.c7_3);
			PlaySound(voice.c);
			
			FileOutputStream fOut;
			
			wrt = scan.next();
			try {
			fOut = new FileOutputStream(nfile);
			fOut.write(wrt.getBytes());
            fOut.flush();
            fOut.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
            System.out.println(str.c7_8);
            PlaySound(voice.l);
            
		} if (result == 2) {
			String scan_name;
			String rd;
			int c;
			
			System.out.println(str.c7_7);
			PlaySound(voice.x);
			scan_name = scan.next();
			final String readfile = scan_name;
			File search = new File(readfile);
			FileInputStream fIn;

			try {
				fIn = new FileInputStream(search);
				while((c = fIn.read())!= -1){
					if (search.exists() == false) {
		                System.out.println(str.c7_6);
		                PlaySound(voice.f);
		                System.exit(0);
		            }
					System.out.print((char)c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
