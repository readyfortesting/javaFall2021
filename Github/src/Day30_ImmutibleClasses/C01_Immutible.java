package Day30_ImmutibleClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Immutible {

	public static void main(String[] args) {
		//String immutible bir class iken List mutible'dir
		
		String str ="Ali";
		str.toUpperCase();
		System.out.println(str); // Ali
		System.out.println(str.toUpperCase()); // ALÝ 
		System.out.println(str); //Ali
		
		
		List<String> isimler = new ArrayList<>();
		System.out.println(isimler); // [] yazdirir.
		isimler.add("Ali");
		System.out.println(isimler); // [Ali] icinde Ali olan bir list yazdirdi.
		//** mutiple classlarda atama olmadan da degisiklik yapabiliyoruz****
		
		isimler.set(0, "Veli");
		System.out.println(isimler); // [Veli] yazdirir.
		
		isimler.remove(0);
		System.out.println(isimler);// [] Önceki haline döndü.
		

		
		
		
	}

}
