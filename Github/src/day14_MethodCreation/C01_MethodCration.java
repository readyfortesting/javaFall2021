package day14_MethodCreation;

public class C01_MethodCration {

	public static void main(String[] args) {
		
		// verilen iki sayinin toplamini ve carpimini yazdiran iki ayri method olusturun.
		
		// METHOD OLUSTURMAK ÝCÝN 3 ADÝM TAKÝP EDÝLÝR.
		
		// 1.adim : method call yazalim
		//toplama(); // bu bir method call'dur.
		
		//2.adim : metoda arguman yazacak miyiz karar vermeliyiz.
		int sayi1=4;
		int sayi2=5;
		
		toplama(sayi1,sayi2); 
		
		// 3.adim: 1. ve 2. adimi yaptiktan sonra Java'dan yardim alip method'u olustururuz.
		 // toplama altinda kirmizi hata veriyordu,uzerine tiklayi create method yapariz.
		
							
	}

	public static void toplama(int sayi1, int sayi2) {
		//4.adim : Erisim duzenleyici ve return type'a karar vermeliyiz.
		
		// Erisim duzenleyici :  access modifier, public ya da private?
	     // Return type:   bizden sadece yazdirma istedigi icin void kalabilir.
		
		System.out.println("sayilarin toplami : " + sayi1+sayi2); // 9
		
		
		// 1.adim
		
	//	carpma(); // method call olusturmak
		
		//2.adim arguman yazip yazmayacagimiza karar vermek
		
		carpma(sayi1,sayi2);
		
		// 3.adim carpma yazisi altinda uyari verir onu Create a Method yapariz ve method olustururuz.
	
		
		// 4.adim : access modifier, public ya da private? - 2) Return type: 
		System.out.println("sayilarincarpimi : " + sayi1*sayi2);
		
		
		
		
		              // Bir methodu 4 adimda olustururuz.
				 //1- methodu olusturmadan javaya olusturtabilmek icin method call yapiyoruz.
				 // 2- arguman ihtiyaci var mi belirleyelim ( parantez icine yazdigimiz degerlere arguman denir)
				// 3- Java'dan yardim alarak method'u olusturalim ( hala alti cizili,uzerine tiklayip method olustururuz.
				// 4.adim: access modifier ve return type'a karar ver.  // yine puplic sectik
				// bundan sonraa methodun yapacagi islevi gerceklestirecek kodlari yazalim.
				
				
		
		
		
		
		
		
		
		
		
		
	}

	public static void carpma(int sayi1, int sayi2) { // private'i public yaparsak herkse acik olur.
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
