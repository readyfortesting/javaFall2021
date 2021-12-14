package Day23_multiDimensionalArrays;

import java.util.Arrays;

public class C06_Arrays {

	public static void main(String[] args) {
		
// SORU) Verilen 2 ARRAY'i birlestiren ve sonucu birlesik array isminde bir array'a kaydeden bir method olusturun.

		  int arr1[]= {3,5,7,10};
		  int arr2[]= {2,4,6,8,9};
		  
		 
		  
		int birlesikArray[]=birlestir(arr1,arr2); // method olusturduk
		 Arrays.sort(birlesikArray);
		System.out.println(Arrays.toString(birlesikArray));
		
		
		
		
	
		
		
		

	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length +arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			birlesikArray[i]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) { //2.array'in elemanlarýný alacagýz.
			birlesikArray[i+arr1.length]=arr2[i];
			
			
		}
		
		
		
		
		return birlesikArray;
	}

}
