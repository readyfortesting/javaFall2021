package day12_IndexOfLastIndexContains;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
	
		// KULLAN�C�DAN B�R CUMLE VE B�R HARF �STEY�N,
	// HARF�N CUMLEDE VAR OLUP OLMAD�G�N� YAZD�R�N. index.of kullanin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine(); //next.Line sectik cunku c�mle istendigi icin.
		
		System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
		char krk=scan.next().charAt(0); // 1 Harf istedigi icin scan.next().charAt(0) seceriz.
		
		//HARF�N CUMLEDE VAR OLUP OLMAD�G�N� YAZD�R�N. index.of kullanin
		
		    int index= cumle.indexOf(krk); // G�R�LEN KARAKTER�N CUMLEDEK� �NDEX'�N� VER�R.
		
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


