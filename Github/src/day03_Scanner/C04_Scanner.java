package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
	
		// KULLANICIDAN DEÐER ALMAK
		
		// KULLANICIDAN DEÐER ALMAK ÝÇÝN 3 ADIM TAKÝP EDÝLÝR 
		
		//1-) ADIM : SCANNER OBJESÝ OLUÞTURMAK
	    Scanner scan=new Scanner(System.in);
	    
	    //2.ADIM : KULLANICIYA NE ÝSTEDÝÐÝMÝZÝ SÖYLEMEK GEREKÝR.
	    //KULLANICI ADI MI,ÞÝFRE MÝ ÝSÝM MÝ N ÝSTEDÝÐÝMÝZÝ YAZMALIYIZ.
	    System.out.println("lutfen isminizi yaziniz");
	    
	    // isim istediðimize göre String olmalý variavle içine atýlmalý.
	    String isim=scan.next();
	    
	    System.out.print("isminiz..:"+isim);
	    
	    
	    // scan bir scanner objesidir.
	    // isim olarak farklý bir isim yazsak da çalýþýr ama biz scasn demeyi tercih ederiz.
	    // scan bir obje olduðu için data türü non-primitive dir.
	    //primitive data türleri sadece deðer içerirken;
	    // non-primitive data türleri deðerin yanýnda method'lar barýndýrýr.
	    // scan. dediðimizde kullanabileceðimiz bu methodlari görebiliriz.
	    // non-primitiveler %90 barýndýrýr.
	    // STRÝNG NON-PRIMITIVEDÝR.
	    
	    
	    
		// SCANNER KULLANICIDAN DEÐER ALMAK ÝSTÝYORSAK

		//(sYSTEM.ÝN) PARANTEZÝN ÝÇÝNE PARAMETRE DENÝR
		
		scan.close();
		
	    
	    
	}

}
