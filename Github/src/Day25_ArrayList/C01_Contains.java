package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {

	public static void main(String[] args) {
		// Verilen bir array'de tekrar edilen elementleri sadece birer tane yazarak,
		// unique elementlerden olusan bir array haline getiriniz.
		
		int arr[]= {1,2,4,5,3,2,5,6,4,7,8,7,9,3,1,0,2,9,3,2};
		
		List<Integer> tekrarsiz=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				tekrarsiz.add(arr[i]);
				
				int tekrarsizArray[]=new int [tekrarsiz.size()];
				tekrarsizArray[i] = tekrarsiz.get(i);
			}
			System.out.println(tekrarsiz);
}
		
		
		// listi array yapiyoruz
		// arrayin uzunlugu yukaridaki listenin size'i kadar olacak.
		
		
	}
	
}
