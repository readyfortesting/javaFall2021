package day05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
    	
    	
    	
	    Scanner scan =new Scanner (System.in);
		System.out.println("Luýtfen email adresinizi giriniz");
		String email=scan.next(); // email istedigi icin String
		
		
		  karakter(email);
		
	}

	private static void karakter(String email) {
		if (!email.contains("@")) { //@ isareti icermiyorsa
			
			System.out.println("Gecersiz email");
			
		} else if (!email.contains("@gmail.com")) {
			
			System.out.println("lutfen gmail adresinizi girin");
			
		} else if (!email.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var,maili kontrol ediniz");
		}else {
           System.out.println("giris onaylandi");
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
        
    }

}
