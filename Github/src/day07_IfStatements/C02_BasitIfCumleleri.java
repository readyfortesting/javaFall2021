package day07_IfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		
		// SORU 1) Kullan�c�dan bir tam say� isteyin ve sayinin tek veya �ift oldu�unu yazd�r�n�z.
		
		// 1.ad�m KULLANICIDAN B�LG� ALMAK ���N scan objesi olu�turmak laz�m.
		
		Scanner scan = new Scanner(System.in);
		
	 // 2.ad�m 	KULLANICIYA MESAJ VERMEK ���N 	System.out.println ("   ") yap�l�r.
		System.out.println("girdiginiz sayi cift bir sayi");
		
	// 3.ad�m KULLANICIDAN B�LG� ALIRKEN, tam say� istedi�imiz i�in int (integer) kullan�r�z.
		int sayi=scan.nextInt();
		
		// 4.ad�m if b�l�m�ne �ift say� ise %2==0 (nod�l2 e�it e�it s�f�r)  // e�er say� tek ise %2==1 (nod�l2e�ite�it1 kullan�l�r.
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift bir sayi");
			
			if (sayi%2==1) {
				System.out.println("girdiginiz sayi tek bir sayi");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
