package Day33_StringBuilder;

public class C03_Equals {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		
		System.out.println(sb1==sb2);// false
		
		System.out.println(sb1.equals(sb2)); // false
		//*** Strring builder String gibi iceriye bakmaz,hata verir.
		// SB'da equals methodu String'deki mantikla calismaz, == mantigi ile calisir.
		// *** Ýkisi ayni StringBuilder degerinde mi diye sorulursa ".compare to" methodu ile karsilastiririz "0"sýfýr donuyorsa aynidir.
		
		System.out.println(sb1.compareTo(sb2)); // 0
		 // Compare : ilk harflerden baslayarak bire bir string builder'lari karsilastirir.
		// eger tum karakterler ayni ise sonuc olarak 0 doner
		// farkli karakter bulursa ilk yazilan SB ikinci yazilandan kac CHAR onde onu yazdirir.
		
		// eger SB'nin esit olup olmadigini istersek 
		// ************* if(sb1.compareTo(sb2)==0) ile bakabiliriz.*****

		
		
			String str="Java";
		//******	System.out.println(sb1==str); == String ile StringBuilder'i karsilastiramaz !*****
			System.out.println(sb1.equals(str)); // false yazdirir.
		//	System.out.println(sb1.compareTo(str)); compare string icin kullanilamaz ******
		//	System.out.println(sb1.compareTo("Java")); olmaz
			
			
			
			
			
	}

}
