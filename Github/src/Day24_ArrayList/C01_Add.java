package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Add {

	public static void main(String[] args) {
		
		List <String> isimler = new ArrayList<>();
		
		System.out.println("Bos liste :" + isimler); //  Bos liste :[]
		
		isimler.add("Ali");
		System.out.println("Bir eleman : " + isimler); // Bir eleman : [Ali]
		
		isimler.add("Veli");
		System.out.println("Ýki eleman :" + isimler); // Ýki eleman :[Ali, Veli]
		
		isimler.add("Can");
		System.out.println("Uc eleman :" + isimler); // Uc eleman :[Ali, Veli, Can]

		
       //**** SONA EKLEMEK ÝSTEMEZSEK,ARASÝNA EKLEMEK ÝSTERSE?******//
		
		// index olan add methodunu secip hangi index yerine hangi isim gelsin yazariz.
		isimler.add(1, "Ayse");
		System.out.println("1.indexe Ayse ekledik : " + isimler);// 1.indexe Ayse ekledik : [Ali, Ayse, Veli, Can]
		
		
		// isimler.add(5); (5) kabul etmez,Deklare ederken belirttigimiz data turu disinda baska bir tur ekleme yapamayiz.
		//*** String demistik, (5) int yazamayiz!!!***
		
		List <String> liste2= new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2 :" + liste2); // liste 2 :[Gunter, Emrah]
		
		
		// liste2'yi 4.indexe yani isimler listesinin SONUNA ekledik.
		isimler.addAll(4, liste2);
		
		// Sona liste 2'ye ekledik : [Ali, Ayse, Veli, Can, Gunter, Emrah]
	    	System.out.println(" Sona liste 2'ye ekledik : " + isimler); 
		
		
		
	    //index olmadan liste 2'yi tekrar ekledik :[Ali, Ayse, Veli, Can, Gunter, Emrah, Gunter, Emrah]
		isimler.addAll(liste2);
		System.out.println("index olmadan liste 2'yi tekrar ekledik :" + isimler);
		
		
	}

}
