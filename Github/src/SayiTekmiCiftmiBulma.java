import java.util.Scanner;

public class SayiTekmiCiftmiBulma {

	public static void main(String[] args) {
// Say�n�n �ift veya Tek mi Oldu�unu Kontrol Eden Java Program�

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
