package Day30_ImmutibleClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {

		String str1="Mustafa";
		String str2="Mustafa";
		
		String str3 = new String("Mustafa");
		String str4= new  String("Mustafa");
		
		System.out.println(str1==str3);// false
		//** stringler icin == yanlis sonuclar verebilir.
		// == hem degere hem de referansa bakar,referanslari farkli oldugunda FALSE verir
		
		System.out.println(str1.equals(str3)); // true
		
		
		
		
	}

}
