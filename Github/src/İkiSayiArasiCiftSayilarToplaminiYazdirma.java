import java.util.Scanner;

public class �kiSayiArasiCiftSayilarToplaminiYazdirma {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		 
        System.out.println("�lk say�y� giriniz.");
 
        int sayiBirinci = input.nextInt();
 
        System.out.println("ikinci say�y� giriniz.");
 
        int sayiIkinci = input.nextInt();
 
        int toplam = 0;
 
        for (int i = sayiBirinci + 1; i < sayiIkinci; i++) {
 
            if (i % 2 == 0) {
 
                toplam = toplam + i;
 
            }
 
        }
 
        System.out.println("�ki say� aras�ndaki �ift say�lar�n toplam� : " + toplam);
		
		
		

	}

}
