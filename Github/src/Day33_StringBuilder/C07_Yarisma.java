package Day33_StringBuilder;

import java.util.Iterator;

public class C07_Yarisma {

	public static void main(String[] args) {
		
		/* SORU : fOR LOOP ÝLE 1000 DEFA BÝR ÝSLEM YAPALÝM.
		 * Oncesinde ve sonrasinda zamani kontrol edip StringBuilder 
		 * ve String class'larinin performanslarini karsilastiralim.
		 * 
		 * ipucu: long TimeSb = System.nanoTime(); kullanalim.
		 */
		
		String str="Merhaba";
		StringBuilder sb= new StringBuilder("Merhaba");
		sb.trimToSize(); // capacity'i length boyutuna indirir.
		
		long time1=System.nanoTime();
		
		for (int i = 0; i <1000; i++) {
			str+=" ";
			
		}
		
		long time2=System.nanoTime();
		
		long stringSure=time2-time1;
		
		
		long time3=System.nanoTime();
		
		for (int i = 0; i <1000; i++) {
			sb.append(" ");
			
			
		}
		
		long time4=System.nanoTime();
		
		long sbSure=time4-time3;
		
		if (sbSure>stringSure) {
			System.out.println("string daha hizli");
		} else {
			System.out.println("stringbuilder daha hizli");
		}
		
		System.out.println(stringSure/sbSure);
		System.out.println("String sure : " + stringSure);
		System.out.println("sb sure : " + sbSure);
	}

}
