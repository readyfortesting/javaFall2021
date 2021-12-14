package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Remove {

	public static void main(String[] args) {

		List<String> harfler = new ArrayList<>();
		
         harfler.add("A");
         harfler.add("Z");
         harfler.add("F");
         harfler.add("D");
         System.out.println(harfler); // [A, Z, F, D]
         
         System.out.println(harfler.remove(1)); // Z harfini kaldirdigini gostermek icin Z yazdirir.
         // yukaridaki islemden sonra harfler tekrar yazdirirsak
         System.out.println(harfler); // [A, F, D] d�nd�r�r.
         
         System.out.println(harfler.remove(2)); // D yazdirir. cunku A, ,F,D KALM��T��Z daha once silinmisti !!!
         
        //** INDEX'i bilmeden KALD�RMAK �STERSEK? *****
         // iNDEX� B�LM�YOURUM F'Y� KALD�R DED�K
         System.out.println(harfler.remove("F")); // TRUE d�nd�r�r.
         // F'yi siler ve sildim demek icin TRUE d�nd�r�r.
         
         System.out.println(harfler.remove("B")); // false
         // Listede B  olamadigi icin silemez ve FALSE d�nd�r�r.
         // Gorevini yapamadigi icin FALSE doner.
         
         System.out.println(harfler); // [A] sadece [A] kaldi.
         
         harfler.add("A");
         harfler.add("Z");
         harfler.add("F");
         System.out.println(harfler.remove("A")); // TRUE
         
         System.out.println(harfler); // [A, Z, F] buldugu ilk A harfini sildi.
         
         harfler.add("A");
         System.out.println(harfler); // [A, Z, F, A] tekrar ekledik.
         
         harfler.removeAll(harfler); //** removeAll bir harfi kabul etmez*****!!!
         
         System.out.println(harfler); //[] bos
 
         
         
 
	}

}
