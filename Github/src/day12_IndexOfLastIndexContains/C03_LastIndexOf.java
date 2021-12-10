package day12_IndexOfLastIndexContains;

import java.util.Scanner;

public class C03_LastIndexOf {

	public static void main(String[] args) {
	
		// Kullanicidan bir cumle ve bir harf isteyin, 
        // harfin cumlede var olup olmadigini yazdirin
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        
        String cumle=scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
        
        char krk=scan.next().charAt(0);
        
        int index= cumle.lastIndexOf(krk); // cumle.(noktadan sonra lastindexof metodunu seceriz.
        
        if (index==(-1)) {    // index==-1 ise harf cumlede kullanilmamis demektir.
            System.out.println("harf cumlede kulanilmamis");
        } else {
            System.out.println("harf cumlede kulanilmis");
        }
        
        scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
