package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
	
		// Soru 2-) Kullan�c�dan g�n isimlerinden birinin ilk harfini isteyin ve o harfle ba�layan g�n isimlerini yazd�r�n�z.
		
		//�RNEK : ilkHarf=P output = "Pazar, Pazartesi veya Per�embe"
		// ilkHarf=S output = "Sali"
  
		// *** B�y�k k���k harf problem olmamas� i�in toUpperCase methodunu kullan�n�z ***///
		
		
		
		Scanner scan=new Scanner(System.in);  // KULLANICIDAN B�LG� ALMAK ���N scan objesi olu�turmak laz�m.
		
		System.out.println("L�tfen gun isimlerinden birinin ilk harfini yaziniz"); // KULLANICIYA MESAJ VERMEK ���N.
		
		//KULLANICININ G�RD��� VER�N�N TAMAMIMINI K���K HARF VEYA B�Y�K HARF YAPAB�L�R�Z. 2.��Z�M.
		// scan.next()ten sonra noktaya bas�p ��kan metotlardan toUpperCase se�ersek b�t�n harfler B�Y�K olur.
		// scan.next()ten sonra noktaya bas�p ��kan metotlardan toLowerCase yazarsak kelimenin tamam�n� K���K harflere �eviririz.
		char ilkHarf=scan.next().toUpperCase().charAt(0);		 // KULLANICIDAN B�LG� ALIRKEN (�lk harf dedi�i i�in char ile al�n�r)
		
		
		
		if (ilkHarf=='P') {
		System.out.println("Pazar, Pazartesi veya Per�embe");
		}
		
		if (ilkHarf=='S') {
		System.out.println("Sali");	
		}
		
		
		if (ilkHarf=='C' || ilkHarf=='c') {  // k���k harf yazsa da ��kmas� i�in  || ilkHarf=='c') yapar�z, 1.��Z�M.
			System.out.println("Carsamba, Cuma veya Cumartesi");
				}
		
		// Kullan�c� CarSamba,CARSAMBA veya farkl� �e�itte �ar�amba yazabilir.
		//KULLANICININ G�RD��� VER�N�N TAMAMIMINI K���K HARF VEYA B�Y�K HARF YAPAB�L�R�Z. 2.��Z�M.
		
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {  // E�ER KULLANICI G�N G�N �SM� OLMAYAN YANLI� B�R KEL�ME G�RERSE.
			System.out.println("Gecersiz harf girdiniz.Lutfen gun isimlerinden birinin bas harfini yaziniz");
			
		}
	
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
