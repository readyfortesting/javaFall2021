import java.util.Scanner;

public class MukemmelSayiBulma {

	public static void main(String[] args) {
		// MukemmelSayi
		
			Scanner scan=new Scanner (System.in);
			int toplam=0;
			System.out.println("bir sayi giriniz");
			int sayi=scan.nextInt();
		 
			for (int i = 1; i <sayi; i++) 
			{
			if (sayi%i==0) {
				toplam+=i;
			}
			}
				if (sayi==toplam) {
					System.out.println(sayi + " Mukemmel bir sayidir");
				}
			else {
				System.out.println(sayi + " mukemmel bir sayi degildir");
			}
		}
	}


