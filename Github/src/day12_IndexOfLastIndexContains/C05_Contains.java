package day12_IndexOfLastIndexContains;

import java.util.Scanner;

public class C05_Contains {

	public static void main(String[] args) {
		
	      // CONTAINS
			// Contains metodu cumlede string var mii yok mu ona bakar.
			// char aratimlaz,MUTLAKA STRING OLMALI.
			// SADECE VAR MI YOK MU ya cevap verir,yani TRUE/FALSE.
			

	
	//  Soru 1) Kullanicidan email adresini girmesini isteyin, 
        //         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, 
        //         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , 
        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin 
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
         String email=scan.next(); // scan.next sectik cunku email adresi tek kelime olur.
        
        int uzunluk=email.length();
        int index=email.lastIndexOf("@gmail.com");
        
        if (!email.contains("@gmail.com")) { // basina ! isareti gelince ÝCERMÝYORSA anlamina gelir.
            
            System.out.println("lutfen gmail adresi giriniz");
        } else if(index==uzunluk-10){  // @gmail.com  karakterleri 10 adet oldugu icin 10'u sectik.
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
