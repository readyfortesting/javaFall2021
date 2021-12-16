package Day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		System.out.println(tarihSaat);
		// 2021-12-03T19:20:16.561813100 yazdirir.
		
		// eger tarih-saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil   saat : dakika seklinde yazdirmak istersek Java'nýn bir class'i daha var.*****
		
		// ********* DateTimeFormatter class'ý******* eger tarih-saati kendi istedigimiz bicimde yazdirmak istersek
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / MM / YYYY /  HH : mm");
		System.out.println(duzenle.format(tarihSaat));      // 03 / 12 / 2021 /  19 : 26 bizim istedigimiz gibi yazdirir.
		
		/* Format Olustururken
		 * GUN: 
		 * d: basta 0 varsa onu yazmadan gun numarasi
		 * dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi verir
		 * DDD : Yilin kacinci gunu oldugunu yazdirir.
		 * 
		 * E, EE, EEE : Gun isminin ilk 3 harfi
		 * EEEE : Gun isminin tamamini yazdirir.
		 * 
		 * AY: (Ay icin M, dakika icin kucuk m yazilir.
		 * M: Basta 0 varsa onu yazmadan ay numarasi
		 * MM:dd : tek haneli aylari 01 gibi basina sifir yazarak ay numarasi 
		 * MMM : Ay isminin ilk 3 harfi
		 * MMMM : Ay isminin tamami
		 * 
		 * YIL
		 * YY :  Yýlýn son 2 rakamini yazdirir.
		 * YYYY : Yilin tamamini yazdirir.
		 * 
		 * SAAT : (24 Saat uzerinden istersek H, 12 Saat duzeninde istiyorsak kucuk h)
		 * 
		 * HH : Saatin tamami,tek rakamli saat olursa 02 gibi.
		 * H : Tek rakamli saat olursa sadece saati.
		 * 
		 * a yazarsak : AM-PM yazdirir.
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
	}

}
