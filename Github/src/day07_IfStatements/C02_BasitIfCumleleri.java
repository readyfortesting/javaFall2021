package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// SORU 1) Kullanýcýdan bir tam sayý isteyin ve sayinin tek veya çift olduðunu yazdýrýnýz.
		
		// 1.adým KULLANICIDAN BÝLGÝ ALMAK ÝÇÝN scan objesi oluþturmak lazým.
		
		Scanner scan = new Scanner(System.in);
		
	 // 2.adým 	KULLANICIYA MESAJ VERMEK ÝÇÝN 	System.out.println ("   ") yapýlýr.
		System.out.println("girdiginiz sayi cift bir sayi");
		
	// 3.adým KULLANICIDAN BÝLGÝ ALIRKEN, tam sayý istediðimiz için int (integer) kullanýrýz.
		int sayi=scan.nextInt();
		
		// 4.adým if bölümüne çift sayý ise %2==0 (nodül2 eþit eþit sýfýr)  // eðer sayý tek ise %2==1 (nodül2eþiteþit1 kullanýlýr.
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift bir sayi");
			
			if (sayi%2==1) {
				System.out.println("girdiginiz sayi tek bir sayi");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
