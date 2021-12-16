package Day25_ArrayList;

import java.util.Arrays;
import java.util.List;

public class C04_ArraysAsList {

	public static void main(String[] args) {

		// verilen array'i ARRAYS class'inden yardim alarak liste cevirebiliriz.
		String arr[]= {"A","b","C","d"};
		
		 List<String> arraydenList=Arrays.asList(arr);
		 System.out.println(arraydenList); // [A, b, C, d]

		

		 
		 arr[1]="Z";
		 
	}

}
