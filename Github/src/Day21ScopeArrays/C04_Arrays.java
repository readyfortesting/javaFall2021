package Day21ScopeArrays;

import java.util.Arrays;

public class C04_Arrays {

	public static void main(String[] args) {
		
	
		// T�M ELEMENTLER� YAZDIRAB�L�R�L�R�Z.
		// FOR LOOP olustururuz.0 dan ba�las�n arrayin length'ine kadar
		   // Array'in elemanlarini yazdirmak istersek loop ile yazdirabiliriz
		
        int arr[] = {2,4,5,6,78,89};
        
        // tum elementleri yazdirabiliriz
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("");
        
        // Ya da Arrays Class'indan yardim alip  direk array olarak yazdirabiliriz
        System.out.println(Arrays.toString(arr));
    }


			
					
	}




  
  
  