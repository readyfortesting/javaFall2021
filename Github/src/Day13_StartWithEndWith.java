

import java.util.Scanner;

public class Day13_StartWithEndWith {

	public static void main(String[] args) {
		
	          // start with- end with  TRUE-FALSE doner.
			// SORUM 1)  // Kullanicidan bir cumle ve bir kelime alin
        // verilen cumlenin verilen kelime(char squence) ile baslayip, baslamadigini
        // ve bitip bitmedigini yazdirin
        
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir cumlecik giriniz");
	String cumlecik=scan.nextLine();
	
	System.out.println("Lutfen bir kelimecik giriniz");
		String kelimecik=scan.next();
		
		if (cumlecik.startsWith(kelimecik)) {
			System.out.println("girilen cumlecik " + kelimecik + " " + "ile basliyor");
			
		} else {
             System.out.println("girilen cumlecik " + kelimecik + " " + "ile baslamiyor");
		}
		if (cumlecik.endsWith(kelimecik)) {
			System.out.println("girilen cumlecik " + kelimecik + " " + "ile bitiyor");
		} else {
            System.out.println("girilen cumlecik " + kelimecik + " " + "ile bitmiyor");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
