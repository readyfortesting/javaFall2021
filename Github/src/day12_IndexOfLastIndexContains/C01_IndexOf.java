package day12_IndexOfLastIndexContains;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
	
		// KULLANÝCÝDAN BÝR CUMLE VE BÝR HARF ÝSTEYÝN,
	// HARFÝN CUMLEDE VAR OLUP OLMADÝGÝNÝ YAZDÝRÝN. index.of kullanin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine(); //next.Line sectik cunku cümle istendigi icin.
		
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		char krk=scan.next().charAt(0); // 1 Harf istedigi icin scan.next().charAt(0) seceriz.
		
		//HARFÝN CUMLEDE VAR OLUP OLMADÝGÝNÝ YAZDÝRÝN. index.of kullanin
		
		    int index= cumle.indexOf(krk); // GÝRÝLEN KARAKTERÝN CUMLEDEKÝ ÝNDEX'ÝNÝ VERÝR.
		
		     // Simdi karsilastirabiliriz.
		
		if (index<0) { // index 0'dan kucukse -1,yani cumlede YOK demektir.
			System.out.println("Girdiginiz harf verilen cumlede yok");
		}
		else {
			System.out.println("Girdiginiz harf verilen cumlede var");
		}
		
		
		
        scan.close();
        
	
	
	
	
	
	
	}
	
			
			
	}


