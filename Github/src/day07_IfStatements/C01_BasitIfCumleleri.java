package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
	
		// Soru 2-) Kullanýcýdan gün isimlerinden birinin ilk harfini isteyin ve o harfle baþlayan gün isimlerini yazdýrýnýz.
		
		//ÖRNEK : ilkHarf=P output = "Pazar, Pazartesi veya Perþembe"
		// ilkHarf=S output = "Sali"
  
		// *** Büyük küçük harf problem olmamasý için toUpperCase methodunu kullanýnýz ***///
		
		
		
		Scanner scan=new Scanner(System.in);  // KULLANICIDAN BÝLGÝ ALMAK ÝÇÝN scan objesi oluþturmak lazým.
		
		System.out.println("Lütfen gun isimlerinden birinin ilk harfini yaziniz"); // KULLANICIYA MESAJ VERMEK ÝÇÝN.
		
		//KULLANICININ GÝRDÝÐÝ VERÝNÝN TAMAMIMINI KÜÇÜK HARF VEYA BÜYÜK HARF YAPABÝLÝRÝZ. 2.ÇÖZÜM.
		// scan.next()ten sonra noktaya basýp çýkan metotlardan toUpperCase seçersek bütün harfler BÜYÜK olur.
		// scan.next()ten sonra noktaya basýp çýkan metotlardan toLowerCase yazarsak kelimenin tamamýný KÜÇÜK harflere çeviririz.
		char ilkHarf=scan.next().toUpperCase().charAt(0);		 // KULLANICIDAN BÝLGÝ ALIRKEN (Ýlk harf dediði için char ile alýnýr)
		
		
		
		if (ilkHarf=='P') {
		System.out.println("Pazar, Pazartesi veya Perþembe");
		}
		
		if (ilkHarf=='S') {
		System.out.println("Sali");	
		}
		
		
		if (ilkHarf=='C' || ilkHarf=='c') {  // küçük harf yazsa da çýkmasý için  || ilkHarf=='c') yaparýz, 1.ÇÖZÜM.
			System.out.println("Carsamba, Cuma veya Cumartesi");
				}
		
		// Kullanýcý CarSamba,CARSAMBA veya farklý çeþitte Çarþamba yazabilir.
		//KULLANICININ GÝRDÝÐÝ VERÝNÝN TAMAMIMINI KÜÇÜK HARF VEYA BÜYÜK HARF YAPABÝLÝRÝZ. 2.ÇÖZÜM.
		
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {  // EÐER KULLANICI GÜN GÜN ÝSMÝ OLMAYAN YANLIÞ BÝR KELÝME GÝRERSE.
			System.out.println("Gecersiz harf girdiniz.Lutfen gun isimlerinden birinin bas harfini yaziniz");
			
		}
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
