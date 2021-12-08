package day07_IfStatements;

import java.util.Scanner;

public class C04_BasitIfCumleleri {

	public static void main(String[] args) {
		
		//Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin.
		
		// 1.adým KULLANICIDAN (gün ismini) BÝLGÝ ALMAK ÝÇÝN scan objesi oluþturmak lazým.
		// Dikdortgenin kenar uzunluklari dedigi icin 2 adimda isteriz.
		
		Scanner scan = new Scanner(System.in);
		
		// 2.adým 	KULLANICIYA MESAJ VERMEK ÝÇÝN 	System.out.println ("   ") yapýlýr.
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin"); 
		
		// 3.adým KULLANICIDAN BÝLGÝ ALMAK,Kenar uzunluðu virgüllü bir ifade olabilir onun için double seceriz.
		        double kenar1=scan.nextDouble();
		
		// dikdortgenin diger kenarýný istemek için yine syso yaparýz.
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin"); 
				double kenar2=scan.nextDouble();
		
				
		// 4.adým if
				
				if (kenar1==kenar2) {
					System.out.println("girilen dikdortgen kare");
				}
		
		if (kenar1!=kenar2) {
			System.out.println("girilen dikdortgen kare degil");
		}
		
		
	
		scan.close();

	} // main method sonu

} // class sonu
