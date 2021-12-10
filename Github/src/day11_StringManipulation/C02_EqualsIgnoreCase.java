package day11_StringManipulation;

public class C02_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		//EQUALS.IGNORE SECERSEK,ÝSTERSE BUTUN KARAKTERLER FARKLÝ YAZÝLSÝN HATALARÝ GORMEZDEN GELÝR VE TRUE DONER.
		
		
		String str1="ali";
		String str2="can";
		String str3="Ali Can";
		String str4= str1+" " + str2;
		
		System.out.println(str4); 
		System.out.println(str3==str4); 
		System.out.println(str3.equals(str4));
		
		System.out.println(str3.equalsIgnoreCase(str4)); // equals yazdirinca ignore methodu cikar,onu seceriz case sensitive kaldirilir.
		// Case sensitive olmadiði icin kucuk yazilan ali can veya buyuk yazan ALÝ CAN TRU doner.
		
		
		String fvr1 ="HaKaN";
		String fvr2 ="SuKuR";
		String fvr3 = "haKan sUKUr";
		String fvr4 = fvr1 + " " + fvr2;
		
		System.out.println(fvr4);  // HaKaN SuKuR
		System.out.println(fvr3==fvr4); // FALSE (== cogunlukla FALSE doner) Hem DEGERLERÝ hem REFERANSLARÝ farkli.
		System.out.println(fvr3.equals(fvr4)); // EQUALS da FALSE verdi,cunku her isim farkli farkli yazildigi icin.Degerleri farkli.
		System.out.println(fvr3.equalsIgnoreCase(fvr4)); // TRUE doner. Icerik ayný,case sensýtýve olmadigindan TRUE doner.
		
		
		
		
	
		
		
		
		
		
		
		
		
	}

}
