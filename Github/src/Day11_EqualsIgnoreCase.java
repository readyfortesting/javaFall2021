

public class Day11_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		
		
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
