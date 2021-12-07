package day04_IncrementDecrement;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
	
		// soru 7   Kullanýcýdan ismini alip isminin bas harfini yazdirin.
		
		// önce kullanýcýdan ismini alalým,ismini almak için önce Scanner oluþturmalýyýz.
		
	Scanner scan = new Scanner(System.in);
	
	// kullanýcýya mesaj vermek için
	System.out.println("Lütfen isminizi yaziniz");
	// ilk harfi istediði için tek bir karakter,aklýmýza hemen char gelir.
	
	char ilkHarf=scan.next().charAt(0);    //scan.next. (noktaya basýnca bi,rsürü þey çýkar ordan charAt METODUNU SEÇERÝZ.
	// ÝSMÝNÝZÝN ÝLK HARFÝ : M   , ÖNCE SABÝT KISIM SEÇÝLÝR  ve syso yapýp "" çift týrnak içine yazýlýryani ilk harfi : ,sonra deðiþke : M
	
		System.out.println("isminizin ilk harfini : " + ilkHarf);
		
		
		
		
		
		
		

	}

}
