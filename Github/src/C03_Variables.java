


public class C03_Variables {

	public static void main(String[] args) {
		
		int sayi1= 10;
		int sayi2= 20;
		
		
		String sayi3= "10";
		String sayi4= "20";
		// çift týrnak içindeki 10 sayý olan on deðildir,çünkü String isim gerektirir.
		
		System.out.println(sayi1+sayi2);
	System.out.println(sayi3+sayi4);
	
	// sayi3 ve sayi4 çift týrnak içinde"10" ve "20" olursa toplamaz, //1020 yapar.
	// " "	String, çift týrnak içinde sayý da olsa kelime,isim olarak kabul eder,toplama yapmaz.

	String harf1="A";
	char harf2='A';
	
	// YUKARIDAKÝ DEÐÝÞKENLERÝ KULLANARAK 30A YAZDIRIN
	
	System.out.println(sayi1+sayi2+harf1); // 30A
	System.out.println(sayi1+sayi2+harf2); // 95
	
	// char ekstra özelliði sebebiyle matematiksel iþlemlerde numerik deðer alýr.
	
	System.out.println(harf1+sayi1+sayi2); //A1020
	System.out.println(sayi1+harf1+sayi2);	//10A20
	System.out.println(harf1+(sayi1+sayi2));
	// ekstra parantez olduðu için önce sayi1 sayi2 toplanýr
    // sonra Harf yazýlýr. //A30
	
	// SAYFA 32 VE SAYFA 34 MÜLAKATLARDA ÇIKABÝLECEK SORULAR.
	
	// BÝLGÝSAYARDA ÝÞLENEN HER ÞEYE DATA DENÝR
	//COMPILE JAVANIN BÝZÝM YAZDIÐIMIZ KODLARI BÝLGÝSAYARIN ANLAMASI ÝÇÝN DERLEMESÝNE DENÝR.
	// OOP CONCEPT : NESNE ODAKLI PROGRAMLAMA (LEGOLAR) PROJENÝN PARÇA PARÇA YAPILIP SONRA BÝRÞETÝRÝLMESÝ
	// VARIABLE : DEÐÝÞKEN. KONTEYNERA BÝR ÝSÝM VERÝRÝZ O BÝZÝM ÝÇÝN SAKLAR.
	// VARIABLE NÝÇÝN KULLANILÞIR: DECLARATION OLUÞTURURKEN. DAATAYI ÝÇÝNE ATABÝLMEK ÝÇÝN VARIABLE'A ATARIZ.
	// VARIABLE NASIL OLUÞTURULU? 2 ÞEYE ÝHTÝYAÇ VAR. 1) DATA TYPE 2 ) VARIABLE'A VERÝLEN ÝSME
	// int sayi=10;
	// declaration , 10 deðer
	
	// a=b; sol taraf declaration a, sað taraf b deðer denir. a da20 olur b de 20 olur,bu iþleme ASSIGN atama denir.
	
	// VARIABLE DECLARATION VE ASSIGNMENT NELERE DIKKAT ETMELÝYÝZ?
	//ONCE DECLARATION SONRA ASSIGMENT OLMALI.SIRAYLA OLMALI.
	// AYNI VARIABLE ÝSMÝNÝ BÝRDEN FAZLA OLUÞTURAMAYIZ.
	// DECLARATION VE ASSIGMENT AYNI ANDA OLMAK ZORUNDA DEÐÝLDÝR.
	// CLASS OLUÞTURMAK ÝÇÝN?
	// PUPLIC MUTLAKA OLMALI
	// MUTLAKA CLASS YAZMALI,Class ismi BÜYÜK HARFLE BAÞLAR VE CamelCase olur.
	
	// method oluþturmak için?
	// public String methodIsmi(parametre)
	// normal parantez yoksa method olmaz.
	// curly brace içine METHOD BODY konulur.
	
	// Main Method?
	// entry point diyebiliriz.
	
	// Main Method oluþturmak için kullanýlan syntax?
	// public static void main (String[]args) {main method Body
	
	// JAVADA KAÇ ÇEÞÝT DATA TYPE?
	// 2 TEMEL DATA TYPE VAR
	//1) PRIMITIOVE (ÝLKEL) : boolean(true/false)
	//char(tek klarakter)
	//byte,short,int,long (tam sayýlar)
	
	// JAVA KAÇ ÇEÞÝT HAFIZA? STACK MEMORY (ÝÇÝNDE PRIMITIVE DATALAR VE NON PRIMITIVE OLANLARIN ADRESLERÝ BULUNUR.
	// 2) HUGE :NON PRIMITIVE DATALAR BULUNBUR.
	
	// PACKAGE srs,sað tuþ,
	}

}
