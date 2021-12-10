package day11_StringManipulation;

public class C01_Equals {

	public static void main(String[] args) {
		
		// ********** ýntervýew questýon ***********//
		 // eQUALS VE == (ESÝT ESÝT) ARASÝNDAKÝ FARK NEDÝR?
		// EQUALS 
		 // Sadece icerige odaklanir,nasil yazildiklarina bakmaz.
		
		// == (esit esit) ise tum karakterlerin ayni olmasi lazimdir.Aksi durumda FALSE  doner.
		
		int a=10;
		int b= a +0;
		System.out.println(a==b); // true yazdirir.
		
		char ch1='K';
		char ch2= 'K' + 0;
		System.out.println(ch1==ch2); //  true
		
		
		String str1="Ali";
		String str2="Can";
		String str3="Ali Can";
		String str4= str1+" " + str2;
		
		System.out.println(str4); // Ali Can Equals da yazdirir.
		System.out.println(str3==str4); // false  == (eþit eþit de ise) false verir.
		
		// *****EQUALS METODU ICIN****
		// ismim3.equals (nokta'dan sonra equals (object an object) boolean - String SECÝLÝR. 
		
			String ismim1 = "Gonca";
			String ismim2 = "Gul";
			String ismim3 = "Gonca Gul";
			String ismim4 = ismim1+" " + ismim2;
		    System.out.println(ismim4);   // Gonca Gul yazdirir.
		    System.out.println(ismim3==ismim4); // False yazdirir. == ÝSE: HEM DEGERE HEM REFERANSÝNA BAKAR,GENELDE FALSE DONER.
		    System.out.println(ismim3.equals(ismim4)); // true doner. // EQUALS - SADECE DEGERE BAKAR.
		    
         
		   
		    
		    
		    
		    
		    
			
		
		
		
		
		
		
		
		
		

	}

}
