

import java.time.LocalDateTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat= LocalDateTime.now();
		
		System.out.println(tarihSaat);
		// Tarih ve Saat birlikte verilir : 2021-12-03T19:16:20.990054500
		
		System.out.println(tarihSaat.toString().startsWith("2021")); // : true
		// .toString -  Stringe cevirir ve String manipulation yapabiliriz.
		
		
		
		
		
		
		
		
		
		

	}

}
