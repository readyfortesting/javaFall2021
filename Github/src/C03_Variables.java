


public class C03_Variables {

	public static void main(String[] args) {
		
		int sayi1= 10;
		int sayi2= 20;
		
		
		String sayi3= "10";
		String sayi4= "20";
		// �ift t�rnak i�indeki 10 say� olan on de�ildir,��nk� String isim gerektirir.
		
		System.out.println(sayi1+sayi2);
	System.out.println(sayi3+sayi4);
	
	// sayi3 ve sayi4 �ift t�rnak i�inde"10" ve "20" olursa toplamaz, //1020 yapar.
	// " "	String, �ift t�rnak i�inde say� da olsa kelime,isim olarak kabul eder,toplama yapmaz.

	String harf1="A";
	char harf2='A';
	
	// YUKARIDAK� DE���KENLER� KULLANARAK 30A YAZDIRIN
	
	System.out.println(sayi1+sayi2+harf1); // 30A
	System.out.println(sayi1+sayi2+harf2); // 95
	
	// char ekstra �zelli�i sebebiyle matematiksel i�lemlerde numerik de�er al�r.
	
	System.out.println(harf1+sayi1+sayi2); //A1020
	System.out.println(sayi1+harf1+sayi2);	//10A20
	System.out.println(harf1+(sayi1+sayi2));
	// ekstra parantez oldu�u i�in �nce sayi1 sayi2 toplan�r
    // sonra Harf yaz�l�r. //A30
	
	// SAYFA 32 VE SAYFA 34 M�LAKATLARDA �IKAB�LECEK SORULAR.
	
	// B�LG�SAYARDA ��LENEN HER �EYE DATA DEN�R
	//COMPILE JAVANIN B�Z�M YAZDI�IMIZ KODLARI B�LG�SAYARIN ANLAMASI ���N DERLEMES�NE DEN�R.
	// OOP CONCEPT : NESNE ODAKLI PROGRAMLAMA (LEGOLAR) PROJEN�N PAR�A PAR�A YAPILIP SONRA B�R�ET�R�LMES�
	// VARIABLE : DE���KEN. KONTEYNERA B�R �S�M VER�R�Z O B�Z�M ���N SAKLAR.
	// VARIABLE N���N KULLANIL�IR: DECLARATION OLU�TURURKEN. DAATAYI ���NE ATAB�LMEK ���N VARIABLE'A ATARIZ.
	// VARIABLE NASIL OLU�TURULU? 2 �EYE �HT�YA� VAR. 1) DATA TYPE 2 ) VARIABLE'A VER�LEN �SME
	// int sayi=10;
	// declaration , 10 de�er
	
	// a=b; sol taraf declaration a, sa� taraf b de�er denir. a da20 olur b de 20 olur,bu i�leme ASSIGN atama denir.
	
	// VARIABLE DECLARATION VE ASSIGNMENT NELERE DIKKAT ETMEL�Y�Z?
	//ONCE DECLARATION SONRA ASSIGMENT OLMALI.SIRAYLA OLMALI.
	// AYNI VARIABLE �SM�N� B�RDEN FAZLA OLU�TURAMAYIZ.
	// DECLARATION VE ASSIGMENT AYNI ANDA OLMAK ZORUNDA DE��LD�R.
	// CLASS OLU�TURMAK ���N?
	// PUPLIC MUTLAKA OLMALI
	// MUTLAKA CLASS YAZMALI,Class ismi B�Y�K HARFLE BA�LAR VE CamelCase olur.
	
	// method olu�turmak i�in?
	// public String methodIsmi(parametre)
	// normal parantez yoksa method olmaz.
	// curly brace i�ine METHOD BODY konulur.
	
	// Main Method?
	// entry point diyebiliriz.
	
	// Main Method olu�turmak i�in kullan�lan syntax?
	// public static void main (String[]args) {main method Body
	
	// JAVADA KA� �E��T DATA TYPE?
	// 2 TEMEL DATA TYPE VAR
	//1) PRIMITIOVE (�LKEL) : boolean(true/false)
	//char(tek klarakter)
	//byte,short,int,long (tam say�lar)
	
	// JAVA KA� �E��T HAFIZA? STACK MEMORY (���NDE PRIMITIVE DATALAR VE NON PRIMITIVE OLANLARIN ADRESLER� BULUNUR.
	// 2) HUGE :NON PRIMITIVE DATALAR BULUNBUR.
	
	// PACKAGE srs,sa� tu�,
	}

}
