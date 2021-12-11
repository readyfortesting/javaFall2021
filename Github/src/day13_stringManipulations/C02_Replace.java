package day13_stringManipulations;

import java.util.Scanner;

public class C02_Replace {

	public static void main(String[] args) {
		
		
		// replace() : Verilen String'deki istenen karakterleri istenen yeni karakter(ler) ile degistirir.
		
		// String olarak verilen 10.000 sayisinin binden buyuk olup
		// olmadigini yazdirin.
		
		// String olarak verilen 10.000 sayisinin
        // binden buyuk olup olmadigini yazdirin
        
        String sonuc="10.000";
        
        sonuc=sonuc.replace(".", "");   // 10000 'e cevirip sonuc'a assign ettik
                                        // = oldugu icin sonuc kalici olarak degisti
        
        
        
        if (Integer.valueOf(sonuc)>1000) {
            System.out.println("bulunan sonuc sayisi 1000'den cok");
        } else {
            System.out.println("bulunan sonuc sayisi 1000'den az");
        }

		
		
		
		
		
		
		
		
		

	}

}
