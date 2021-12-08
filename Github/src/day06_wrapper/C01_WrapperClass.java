package day06_wrapper;

public class C01_WrapperClass {

	public static void main(String[] args) {
		
		int sayi1=10;        // sayi1 yazýp noktaya bastýðýmýzda hiçbir method çýkmaz çünkü int 'dýr,yani primitive'dir.
		Integer sayi2=20;    // sayi2 yazýp noktaya bastýðýmýzda ise birçok method gelir,çünkü sayý2 Integer'dýr,yani WRAPPER CLASS'týr.
		
		String tel1="3578897";
		String tel2="3245434";
				
		System.out.println(tel1 + tel2); //35788973245434 bunlarý toplamaz,string olðu için yanyana yazar.
		
		// EÐER BU SAYILARI TOPLAMAK ÝSTERSEK ? // Ýþte o zaman WRAPPER CLASS kullanýyoruz.
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2)); // tel1 ve tel2'yi TOPLADI sonuç:6824331
		
		System.out.println(Integer.MIN_VALUE); //Min.deðeri -2147483648
		System.out.println(Integer.MAX_VALUE); //Max deðeri  2147483647

		System.out.println(Double.MAX_VALUE); // Max deðeri :1.7976931348623157E308 E308 yanýnda 307 tane SIFIR var demek.
		System.out.println(Double.MIN_VALUE); //Min.deðeri : 4.9E-324
		
		System.out.println(Short.MAX_VALUE);  // Max deðeri :32767
		System.out.println(Short.MIN_VALUE);  //Min.deðeri : -32768
		
		System.out.println(Byte.MAX_VALUE);   // Max deðeri :127
		System.out.println(Byte.MIN_VALUE);   //Min.deðeri : -128
		
        
		// Her String de MATEMATÝKSEL ÝFADEYE ÇEVRÝLEMEZ.//
		String caddeNo="B203";
		String sokakNo="1564";
		//System.out.println(Integer.valueOf(caddeNo)+Integer.valueOf(sokakNo)); 
		//JAVA HATA VERÝR. ÇÜHKÜ HER STRÝNG MAT. ÝFADE ÇEVRÝLEMEZ B HARFÝ VAR.
	  //Stringi matematikse iþleme çevirebilmel için numerik ifadeler olmasý gerekir,içinde HARF olursa hata verir.
		// Java NumberFormatExeption hatasý verir.
		//stops execution
		
		System.out.println("Hello world");
		
		// wrapper class PRÝMÝTÝVE'leri NON-PRÝMÝTÝVE ifadeye çevirmemize yarar.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
