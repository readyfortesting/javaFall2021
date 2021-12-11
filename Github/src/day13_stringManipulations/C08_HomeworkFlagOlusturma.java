package day13_stringManipulations;

import java.util.Scanner;

public class C08_HomeworkFlagOlusturma {

	public static void main(String[] args) {
	
		// soru -6) Kullanicidan bir sifre girmesini isteyin.
		// Asagidaki harfleri sagliyorsa "sifre basari ile tanimlandi";
		// sartlari saglamazsa "islem basarisiz,lutfen yeni bir sifre girin" yazdirin.
		
		// - Ýlk harf BUYUK HARF olmali
		// - Son harf kucuk harf olmali
		// -  Sifre bosluk icermemeli.
		// Sifre uzunlugu en az 8 karakter olmali.
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Lutfen bir sifre giriniz");
		String sifrem = scan.next();
		
		// tum eksikleri soylkemesi icin 4 sart icin ayri ayri if yapariz.
		// basta bir flag tanimlariz, eger onda degisim varsa sifre basarisiz
		// degisim yoksa sifre basarili olacak.
		
		int flag =0; //  - Ýlk harf BUYUK HARF olmali
		
		if (!(sifrem.charAt(0)>='A' && sifrem.charAt(0)<='Z')) {
		   System.out.println("Sifre buyuk harfle baslamalidir");
		   flag++;
		}
		
		// - Son harf kucuk harf olmali
		if (!(sifrem.charAt(sifrem.length()-1)>='a' && sifrem.charAt(sifrem.length()-1)<='z')) {
			System.out.println("Sifre kucuk harfle bitmelidir");
			flag++;
			
		}
		
		 //	// -  Sifre bosluk icermemeli.
		if (sifrem.contains(" ")) {   // eger sifre bosluk icerirse ("Sifre bosluk icermemeli"); yazar.
			flag++;
			System.out.println("Sifre bosluk icermemeli");
			flag++;
		}
		
		// Sifre uzunlugu en az 8 karakter olmali.
		
		if (sifrem.length()<8) {    // eger sifre 8 kucukture esitse sifre enaz 8 karakter olmalidir yazar.
			System.out.println("Sifre en az 8 karakter olmalidir");
			flag++;
		}
		
		else {
			System.out.println("Ýslem basarisiz,Lutfen yeni bir sifre giriniz");
		}
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}
