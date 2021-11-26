import java.util.Scanner;

public class ÝkiSayiArasiCiftSayilarToplaminiYazdirma {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		 
        System.out.println("Ýlk sayýyý giriniz.");
 
        int sayiBirinci = input.nextInt();
 
        System.out.println("ikinci sayýyý giriniz.");
 
        int sayiIkinci = input.nextInt();
 
        int toplam = 0;
 
        for (int i = sayiBirinci + 1; i < sayiIkinci; i++) {
 
            if (i % 2 == 0) {
 
                toplam = toplam + i;
 
            }
 
        }
 
        System.out.println("Ýki sayý arasýndaki çift sayýlarýn toplamý : " + toplam);
		
		
		

	}

}
