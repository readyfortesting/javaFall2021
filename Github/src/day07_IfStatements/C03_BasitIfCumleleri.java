package day07_IfStatements;

import java.util.Scanner;

public class C03_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// Soru3: kULLANICIDAN G�N �SM�N� AL�N VE HAFTA�C� VEYA HAFTASONU OLUGUNU YAZD�R�N.
		// �RNEK:   gun=Pazar output = "Hafta sonu"
		//          gun=Sali  output = "Hatfa ici"          
		//*** String i�in EQUALS methodunu kullan�n.
		
		
		// 1.ad�m KULLANICIDAN (g�n ismini) B�LG� ALMAK ���N scan objesi olu�turmak laz�m.
		Scanner scan=new Scanner(System.in);
	
		// 2.ad�m 	KULLANICIYA MESAJ VERMEK ���N 	System.out.println ("   ") yap�l�r.
		System.out.println("Lutfen gun ismini yaziniz");
		
		// 3.ad�m KULLANICIDAN B�LG� ALMAK, G�N ismi istedi�imiz i�in String kullan�r�z. ve next seceriz ��nk� g�nler tek kelime.
		String gun=scan.next().toLowerCase(); //next ten sonra noktaya bas�p toLowerCase metodunu se�eriz,kullan�c� nas�l yazarsa yazs�n 
		                                      // kelimenin hepsini k���k harfe cevirecek.
		
		// 4.ad�m if 
		
		if (gun=="pazar") {
			System.out.println("Hafta sonu"); // yapsak da consolda herhangi bir �ey ��kmaz.
		}
		
		if (gun!="PAZAR") {
			System.out.println("pazar degil");
		}
		// String non-primitive oldu�u icin == (esit esit) kullan�lamaz. Stringlerde EQUALS metodu kullan�l�r.
		
		if (gun.equals("pazar") || gun.equals("Cumartesi")) {    // b�ylece e�er g�n pazar veya cumartesi g�n�ne e�itse Hafta sonu yazar.
			System.out.println("Hafta sonu");
		}                                                        // sTR�NG DE E��TL�K ARANIYORSA equals METODU KULANILIR.
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
