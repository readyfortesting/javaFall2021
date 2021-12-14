package Day22_Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class C02_Split {

	public static void main(String[] args) {
		// Java öðrenmek çok güzel cümlesinin kelimelerini ter sýrada yazdýrýn.
		
		String cumle = "Java ogrenmek cok guzel";
		
		String kelimeler[]=cumle.split(" ");
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrenmek, cok, guzel]

		//ters yazmak icin LOOP olusturmaliyiz
		
		for (int i = kelimeler.length-1; i>=0; i--) {
			System.out.print(kelimeler[i]+ " ");
			// guzel cok ogrenmek Java 
		}
		
	}

}
