

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	public static void main(String[] args) {
	
		LocalTime saat=LocalTime.now();
		System.out.println("baslangic saati :" +saat); // 17:34:11.409229800
		
		int sayi=10;
		for (int i = 0; i < 100000; i++) {
			sayi++;
			
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati : " + saatBitis); // ilk olusturulan saati gosterdiginden AYNI saati gosterir.
		//	baslangic saati :17:36:42.898494
		// 	bitis saati : 17:36:42.898494

		//*** yeni bir LOCAL TIME OLUSTURDUKTAN SONRA FARKLÝ (saatBitis)
		//  baslangic saati :17:39:52.209582200
		 // bitis saati : 17:39:52.211582400

		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		System.out.println("For loop : " + (nanobitis-nano1) + "nano saniyede tamamlandi");
		// For loop : 3000000.0nano saniyede tamamlandi
		
		System.out.println(saat.getMinute());
		//6 (o andaki dakikayý gosterir)
		
		System.out.println(saat.plusMinutes(1050));
		// 1050 dk sonra saat : 12:37:02.095554900
		
		System.out.println(saat.minusHours(20));
		// 20 saat once saat : 23:07:51.797751500
		
		// Bir ulkenin LOCAL TIME yazdirmak istersek :
		LocalTime yerelSaat= LocalTime.now(ZoneId.of("Turkey"));
		System.out.println(yerelSaat); // 19:11:31.107734600 (Turkiye'nin yerel saatini gosterir)
		//** Ulke ismini STRING icinde yazmaliyiz****
		
		
		
		
	}

}
