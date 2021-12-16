package Day25_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		
		// Verilen bir listede icinde belirli bir harf olan elemanlari silen bir method yaziniz.

		
		List<String> str=new ArrayList<>();
		str.add("Jeyhun");
		str.add("Yildiz");
		str.add("Mustafa");
		str.add("Tugba");
		str.add("Turgut");
		System.out.println(str);
	
		String silinecekharf="a";
		
		killThemAll(str,silinecekharf);
		
		
	}

	private static List<String> killThemAll(List<String> str, String silinecekharf) {
		
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).contains(silinecekharf)) {
				
				str.remove(i);
			}
		}
		
		
		System.out.println(str);
		return str;
		
		
		
	}

}
