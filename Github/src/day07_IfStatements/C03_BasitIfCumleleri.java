package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// Soru3: kULLANICIDAN GÜN ÝSMÝNÝ ALÝN VE HAFTAÝCÝ VEYA HAFTASONU OLUGUNU YAZDÝRÝN.
		// ÖRNEK:   gun=Pazar output = "Hafta sonu"
		//          gun=Sali  output = "Hatfa ici"          
		//*** String için EQUALS methodunu kullanýn.
		
		
		// 1.adým KULLANICIDAN (gün ismini) BÝLGÝ ALMAK ÝÇÝN scan objesi oluþturmak lazým.
		Scanner scan=new Scanner(System.in);
	
		// 2.adým 	KULLANICIYA MESAJ VERMEK ÝÇÝN 	System.out.println ("   ") yapýlýr.
		System.out.println("Lutfen gun ismini yaziniz");
		
		// 3.adým KULLANICIDAN BÝLGÝ ALMAK, GÜN ismi istediðimiz için String kullanýrýz. ve next seceriz çünkü günler tek kelime.
		String gun=scan.next().toLowerCase(); //next ten sonra noktaya basýp toLowerCase metodunu seçeriz,kullanýcý nasýl yazarsa yazsýn 
		                                      // kelimenin hepsini küçük harfe cevirecek.
		
		// 4.adým if 
		
		if (gun=="pazar") {
			System.out.println("Hafta sonu"); // yapsak da consolda herhangi bir þey çýkmaz.
		}
		
		if (gun!="PAZAR") {
			System.out.println("pazar degil");
		}
		// String non-primitive olduðu icin == (esit esit) kullanýlamaz. Stringlerde EQUALS metodu kullanýlýr.
		
		if (gun.equals("pazar") || gun.equals("Cumartesi")) {    // böylece eðer gün pazar veya cumartesi gününe eþitse Hafta sonu yazar.
			System.out.println("Hafta sonu");
		}                                                        // sTRÝNG DE EÞÝTLÝK ARANIYORSA equals METODU KULANILIR.
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
