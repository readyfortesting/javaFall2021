import java.util.Scanner;

public class SayiTekmiCiftmiBulma {

	public static void main(String[] args) {
// Sayýnýn Çift veya Tek mi Olduðunu Kontrol Eden Java Programý

		int sayi;
		System.out.println("bir sayi giriniz");
		
		Scanner scan= new Scanner(System.in);
		sayi=scan.nextInt();
		
		// Eger sayi 2'ye bolunurse cifttir.
		
		if (sayi % 2 == 0) {
			System.out.println("girdiginiz sayi cifttir");
		}else {
			System.out.println("girdiginiz sayi tektir");
		}
		
		
		
		
	}

}
