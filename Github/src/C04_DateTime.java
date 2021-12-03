

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class C04_DateTime {

	public static void main(String[] args) {
		/* bir String ve bir int variable olusturalim
		 * bir loop icerisinde bu variable'lari 1000 kere degistirelim.
		 * ve islem surelerini kiyaslayalim?
		 */
		
		LocalTime saatS=LocalTime.now();
		System.out.println("baslangic saati :" +saatS); // 17:34:11.409229800
		
		String str="celil";
		for (int i = 0; i < 10000; i++) {
			str+=" ";
			
		}
		
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("bitis saati : " + saatBitisS);
		double nanoS=saatS.getNano();
		double nanobitisS=saatBitisS.getNano();
		
		System.out.println("String For loop : " + (nanobitisS-nanoS) + "nano saniyede tamamlandi");
		
		
	}

}
