package Day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_List {

	public static void main(String[] args) {
		
		// Verilen bir array'den istenen degere sahip elementleri silip kalani yeni bir array olarak kaydedin
		// ve sonra yeni array'i yazdirin.
		
		int arr[]= {3,4,5,6,3,5};
		int silinecekEleman=3; // kac tane 3 var saymamiz lazim.
		//int silinecekEleman=6;
		
		List<Integer> gecici = new ArrayList<>();
		
		// For loop olusturup silinecek elemana (yani 3'e ) esit olmayanlari atacagiz.
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=silinecekEleman) { // arr i silinecek elemana esit degilse gecici listeye arr i 'yi eklesin.
				gecici.add(arr[i]);
				
			}
		}
		System.out.println(gecici); // [4, 5, 6, 5]
	
		////int silinecekEleman=6;  yaparsak // System.out.println(gecici);[3, 4, 5, 3, 5] yazdirir.

		//** sonuc illaki ARRAY olsun derse??
		
		// listeden alip alip ARRAY'e ekleyebiliriz.
		//yeni bir ARRAY olustururuz.
		
		int yeniArray[]=new int[gecici.size()];
		
		
		//Listedeki elemanlari INDEX ile alabilir miyiz??
		
		for (int i = 0; i < yeniArray.length; i++) {
			yeniArray[i]=gecici.get(i); // indexi i olani getirir bu method. // .get()
		}
		// YENÝ ARRAY'ÝMÝZÝ YAZDÝRALÝM
		System.out.println("Array olarak : " + Arrays.toString(yeniArray));
		// Array olarak : [4, 5, 6, 5]
	}

}
