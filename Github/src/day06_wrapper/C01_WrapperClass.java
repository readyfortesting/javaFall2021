package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;        // sayi1 yaz�p noktaya bast���m�zda hi�bir method ��kmaz ��nk� int 'd�r,yani primitive'dir.
		Integer sayi2=20;    // sayi2 yaz�p noktaya bast���m�zda ise bir�ok method gelir,��nk� say�2 Integer'd�r,yani WRAPPER CLASS't�r.
		
		String tel1="3578897";
		String tel2="3245434";
				
		System.out.println(tel1 + tel2); //35788973245434 bunlar� toplamaz,string ol�u i�in yanyana yazar.
		
		// E�ER BU SAYILARI TOPLAMAK �STERSEK ? // ��te o zaman WRAPPER CLASS kullan�yoruz.
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2)); // tel1 ve tel2'yi TOPLADI sonu�:6824331
		
		System.out.println(Integer.MIN_VALUE); //Min.de�eri -2147483648
		System.out.println(Integer.MAX_VALUE); //Max de�eri  2147483647

		System.out.println(Double.MAX_VALUE); // Max de�eri :1.7976931348623157E308 E308 yan�nda 307 tane SIFIR var demek.
		System.out.println(Double.MIN_VALUE); //Min.de�eri : 4.9E-324
		
		System.out.println(Short.MAX_VALUE);  // Max de�eri :32767
		System.out.println(Short.MIN_VALUE);  //Min.de�eri : -32768
		
		System.out.println(Byte.MAX_VALUE);   // Max de�eri :127
		System.out.println(Byte.MIN_VALUE);   //Min.de�eri : -128
		
        
		// Her String de MATEMAT�KSEL �FADEYE �EVR�LEMEZ.//
		String caddeNo="B203";
		String sokakNo="1564";
		//System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo)); 
		//JAVA HATA VER�R. ��HK� HER STR�NG MAT. �FADE �EVR�LEMEZ B HARF� VAR.
	  //Stringi matematikse i�leme �evirebilmel i�in numerik ifadeler olmas� gerekir,i�inde HARF olursa hata verir.
		// Java NumberFormatExeption hatas� verir.
		//stops execution
		
		System.out.println("Hello world");
		
		// wrapper class PR�M�T�VE'leri NON-PR�M�T�VE ifadeye �evirmemize yarar.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
