package Day24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_SizeAndEmptyMethod {

	public static void main(String[] args) {
		
		//****size() method ArrayList'de kac eleman oldugunu gosterir.******//
		
	List<String> hayvan = new ArrayList<>();
	System.out.println(hayvan.size()); // 0
	
	hayvan.add("kedi");
	System.out.println(hayvan.size());//1
	
	hayvan.add("tavsan");
	System.out.println(hayvan.size()); // 2
	
		// isEmpty() methodu ArrayList bos ise TRUE,bos degilse FALSE dondurur.
	
		

	}

}
