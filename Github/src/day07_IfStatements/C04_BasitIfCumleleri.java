package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		//Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin.
		
		// 1.ad�m KULLANICIDAN (g�n ismini) B�LG� ALMAK ���N scan objesi olu�turmak laz�m.
		// Dikdortgenin kenar uzunluklari dedigi icin 2 adimda isteriz.
		
		Scanner scan = new Scanner(System.in);
		
		// 2.ad�m 	KULLANICIYA MESAJ VERMEK ���N 	System.out.println ("   ") yap�l�r.
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin"); 
		
		// 3.ad�m KULLANICIDAN B�LG� ALMAK,Kenar uzunlu�u virg�ll� bir ifade olabilir onun i�in double seceriz.
		        double kenar1=scan.nextDouble();
		
		// dikdortgenin diger kenar�n� istemek i�in yine syso yapar�z.
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin"); 
				double kenar2=scan.nextDouble();
		
				
		// 4.ad�m if
				
				if (kenar1==kenar2) {
					System.out.println("girilen dikdortgen kare");
				}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdortgen kare degil");
		}
		
		
	
		scan.close();

	} // main method sonu

} // class sonu
