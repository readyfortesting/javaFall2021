package Day18_NestedForLoop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		
		// Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse veya toplam 500'u gecerse
        // "Bu kadar sayi yeter"
        // ".. adet sayi girdin, toplami ..." yazdirin

		 System.out.println("L�tfen toplamak �zere say� giriniz\n��kma i�in 000 yaz�n�z ");
	        Scanner scan = new Scanner(System.in);
	        int sayi = 1;
	        int toplam = 1;
	        int sayac = 0;
	        while (sayac < 10 && toplam < 500 && sayi != 000) {
	            sayi = scan.nextInt();
	            toplam += sayi;
	            sayac++;
	            if (sayac >= 10 || toplam > 500) {
	                System.out.println("\n*****bu kadar yeterli*****\n");
	            } else {
	            }
	        }
	        System.out.println(
	                "��lem Adetiniz < " + ((sayac) - 1 + " >" + " \nToplam         " + "< " + ((toplam) - 1) + " >"));
		
		
		

	}

}
